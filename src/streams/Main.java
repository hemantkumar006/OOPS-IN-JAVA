package streams;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //List<String> fruits = new ArrayList<>();
        List<String> fruits = List.of("mango","dragon fruit","kiwi");//List.of creates a im-mutable list
//        fruits.add("apple");
//        fruits.add("guava");
//        fruits.add("pineapple");

//        fruits.stream()
//                .forEach(System.out::println);
//
        Stream<String> fruitStream = fruits.stream();

        fruitStream.forEach((String str) -> System.out.println(str));//here we dont have control on for loop

        //System.out.println(fruitStream.count());//we can not do this
        //✅ Why this happens:
        //Streams in Java can be used only once.
        //After a terminal operation like .forEach(), .count(), .collect(), etc.,
        // the stream is closed and cannot be reused.

        //both printing statement is same
        for(String str:fruits){
            //here we have control on for loop
            System.out.println(str);
        }

        //stream is basically class or a interface which has a lot of function
        //that a user might want to use to process the data in the collections


        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> listeven = numbers.stream()
                .filter(el->el%2==0)
                .map( el->el*el)
                .toList();//introduce in java 16
        System.out.println(listeven);

        //example: Database->SQL->Rows that store Employee Data in table called "employee"
        //Java class->Employee->which is a representation of Employee row in java
        // Java class-> EmlpoyeeMapper is a class has a function -> mapToModel->which maps the
        //data, read from employee table to the object of Employee class in java

        //                             Collections<Resultset>:resultset is the result of executing the query
       // List<Employee> employelist = getAllEmployeefromDB().stream()//stream of resultset
        //.map(dataRow->employeeMapper.mapToModel(dataRow))           //stream of employee
          //      .filter(emp->emp.noOfYearsInCompany()<=1)          //stream of employee
            //    .toList();


        //////////////////Lazy evaluations in stream///////////////

        List<String> vegetables = List.of("Onion","potatao","cabbage");

        vegetables.stream()
                .filter(fruit ->fruit.startsWith("O"))
                .map((String fruit) -> fruit.toUpperCase())
                .forEach(System.out::println);

//        How lazy evaluation works here:
//        .stream()
//        ➤ Creates a pipeline, nothing processed yet.
//
//        .filter(...)
//        ➤ Adds a filter stage to the pipeline.
//
//        .map(...)
//        ➤ Adds a map stage to the pipeline.
//
//        .forEach(...)
//        ➤ This is the terminal operation.
//        ➤ It starts the actual processing.
//        ➤ Java now pulls elements one by one through the pipeline:
          //-> when any element is not passing the condtion skipped from there and taking the new element

//        | Concept                     | Meaning                                                         |
//        | --------------------------- | --------------------------------------------------------------- |
//        | **Lazy Evaluation**         | Stream doesn't do anything until a terminal operation is called |
//        | **Intermediate operations** | Like `.filter()` and `.map()`, .sort are lazy                          |
//        | **Terminal operation**      | Like `.forEach()`,.collect, .count,.toList triggers the entire stream                    |
//        | **Element-wise**            | Stream processes one element at a time through all stages       |



    }
}
