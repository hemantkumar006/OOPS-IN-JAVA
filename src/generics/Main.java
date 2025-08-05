package generics;

import lambdas.GFGClass;
import p1.Animal;

import java.awt.dnd.DragGestureEvent;

public class Main {
    public static void main(String[] args) {
      MyGenericClass<String> myGenericClass = new MyGenericClass<>("Hemant");
      MyGenericClass<Animal> myGenericClass1 = new MyGenericClass<>(new Animal(4,true,
              "red","meow","veg","mammal"));

        System.out.println(myGenericClass.element.substring(0,1));
        //now on mymyGenericClass1, substring is working because i have made a function substring in animal class.
        System.out.println(myGenericClass1.element.substring(0,1));

        MyGenericClass<String> myGenericClass2 = new MyGenericClass<>();
        //System.out.println(myGenericClass2.element.substring(0,1));//it will give exception because
        // myGenricClass2's element is null

        Pair<Integer, String> pair1 = new Pair<>(123,"hemant");
        System.out.println(pair1.key);
        Pair<String,Animal> animal1 = new Pair<>("cat", new Animal(4,true,
                "red","meow","veg","mammal"));

        System.out.println(animal1.value.substring(0,1));
        //here to print the animal1 call the toString function in the object class
        System.out.println(animal1);

        //why we use getter and setter
        // 1. Encapsulation (Data Hiding)
        // If you make fields public, anyone can directly change them, which can lead to invalid or insecure states.
        // With setters, you can control and validate what values are being set.

        // 2. Future-Proofing
        // If you use getters/setters, you can later add logic without changing the external code that uses your class.

        // What Happens If You Use public Fields?
        // No way to debug, log, or restrict access.
        // No control or validation.
        // Breaks object-oriented principles (mainly encapsulation).

        /////////////////////Generic function//////////////////////////

        GencFunc g1 = new GencFunc();
        g1.printValues("hemant");
        g1.printValues(123);

        GencFunc g2  = new GencFunc();
        g2.printValues(5,"hemant");

        GencFunc.printValues("hemant",25);

        g2.printValues(new GFGClass());
        g2.printValues(()-> System.out.println("hello"));

    }
}
