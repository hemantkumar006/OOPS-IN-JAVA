package generics;

import lambdas.MyFuncInt2;
import lambdas.MyFunctionalInterface;

public class GencFunc {
    //Generics let you write code that works with any data type,
    // but still keeps it type-safe. You define the type once and use
    // it without worrying about casting or runtime errors.
    //Generics = write once, use with any type, safely and cleanly.
    public <T> void printValues(T t){
        System.out.println(t);
    }

    public <T,K> void printValues(T t, K k){
        System.out.println(t);
        System.out.println(k);
    }



    public static <T> void printValues(T t, int a){
        System.out.println(t);System.out.println(a);
        //t.test1();
    }

    //Think of it like this:
    //You are telling Java:

    //"I'll use some unknown type T, but whatever it is,
    // it must have the method test1() (i.e., it must follow the rules of MyFunctionalInterface)."
    // Only allow objects of types that follow the rules defined in MyFunctionalInterface.

    public static <T extends MyFunctionalInterface> void printValues(T t){
        //System.out.println(t);System.out.println(a);
        t.test1();
    }
}
