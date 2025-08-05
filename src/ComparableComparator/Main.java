package playground;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(500000);
        Car c2 = new Car(7000000);
        Car c3 = new Car(100000);

        System.out.println(c1.compareTo(c2));

        List<Car> carList = new ArrayList<>(List.of(c1,c2,c3));
        Comparator<Car> carComparator = (car1 , car2)->{
            return (int) (car2.price - car1.price);
        };

        //Collections.sort(carList);

        carList.sort(carComparator);
        System.out.println(carList);

//        ✅ Use of Comparable and Comparator in Java
//        Both are used for sorting objects in custom or default ways.
//         Comparable (natural order) //Natural/default sorting (inside the class)
//         Comparator (custom order) //Custom sorting (outside the class)

//        🔹 Why do we need them?
//         In Java, if you create your own class (like Student, Employee, etc.),
//         Java doesn’t know how to compare two objects of that class.
//         To sort a list of such objects, you must define the sorting logic.

    }
}
