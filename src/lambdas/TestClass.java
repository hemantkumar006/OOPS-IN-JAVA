package lambdas;

import java.sql.SQLOutput;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestClass {
    public static void main(String[] args) {

        //some java functional interface
        //Predicate
        //Consumer
        //Function

        Predicate<Integer> isEven = (myInt) -> myInt % 2 == 0;

        System.out.println(isEven.test(5));
        System.out.println(isEven.test(10));

        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("nikhil");

        //Function<String,Integer> getLength = s -> s.length();
        Function<String,Integer> getLength = String::length;
        System.out.println(getLength.apply("Hemant"));



        MyFunctionalInterface g1 = new GFGClass();
        //g1.test2();
        test(g1);
        // MyFuncInt2 mf2 = ()->{
        // return "hemant"; //instead of this we can write just without bracket
        // };
        MyFuncInt2 mf2 = ()->  "hemant";
        //instead of this we can write just without bracket

        System.out.println(mf2.name());


        MyFunctionalInterface m1 = ()->{
            //this is a lambda expression
            //it is creating a annonomously class which implements the interface
            //and then it is a creating a object and accessing the members  
            System.out.println("Myclass -test1");
        };
        //(argument list) ->{
        //

        // }
        //MyFunctionalInterface m1 = new MyClass();
        //m1.test1();
        //test(m1);
    }


        //i want to pass an argument which must have a .test1() function
        public static void test(MyFunctionalInterface g12){
        //-> this lets you accessible only the
        //members which is in MyFunctionalInterface

        //public static void test(GFGClass g12){
        //this lets u access only members which is in GFGClass
            // so it means we can accessible only members which has that type only
            //means if GFGClass then only accessible GFGClass members if we have
            //MyFunctionalInterface , then we can access only the MyFunctionalInterface members

            //VVI- In order to get the MyFunctionalInterface members , we have to depend on the class
            //which implements that interface but using the functional interface we can achieve without
            // depending on the class which implements the interface but we have one condition here
            //that the interface class should have only one abstract method

            //functional interface: the interface which have only one abstract method.

            //g12.test3();
            //System.out.println(g12.a);
            //g12.name = "hemant kumar";

        }

}
