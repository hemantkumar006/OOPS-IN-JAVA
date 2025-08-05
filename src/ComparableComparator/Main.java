package ComparableComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(500000);
        Car c2 = new Car(7000000);
        Car c3 = new Car(100000);

        System.out.println(c1.compareTo(c2));

        List<Car> carList = new ArrayList<>(List.of(c1,c2,c3));
        Comparator<Car> carComparator = (car1 , car2)->{
            // behind the scenes java is going to create a anonymous class , implement the comparator interface in
            //that class and write this logics inside the compare function and then use it

            return (int) (car2.price - car1.price);
        };

        //Collections.sort(carList); this is not related to carComparator at all until we passed that in it
        //like Collections.sort(carList , carComparator); //here sort will not extend comparable
        //Collections.sort(carList) //but here sort must extend comparable because java does not know the how to sort
        //so it will take the default method

        //Collections.sort() defined in java 8 but after java 11 we have method like carList.sort(carComparator);
        //carList.sort(we have to pass here the sorting method like: carComparator)

        carList.sort(carComparator);
        System.out.println(carList);

//        ✅ Use of Comparable and Comparator in Java

         // more understandable
//        Comparator : it is mostly used for arranging multiple items a/c to any order u like.
//        Comparable : it will mandate , it will established a default method of comparison
//        one class can have only one comapreTo function but the object of the same class can be compared in
//        many-many manners with the help of comparator


//        Both are used for sorting objects in custom or default ways.
//         Comparable (natural order) //Natural/default sorting (inside the class)
//         Comparator (custom order) //Custom sorting (outside the class)

//        🔹 Why do we need them?
//         In Java, if you create your own class (like Student, Employee, etc.),
//         Java doesn’t know how to compare two objects of that class.
//         To sort a list of such objects, you must define the sorting logic.


        //Interview questions : how u can sort an object using the stream

        List<Car> streamCarList = carList.stream()
                                  .filter(c-> c.price>600000)
                                  .sorted((car1,car2)->{
                                      return (int) (car2.price - car1.price);
                                  })
                                  .toList();

    }
}
