package p2;

import java.util.Stack;

public class MyStaticClass {

    int a = 5; //for every object the value of a is 5 for that object
    static int b  = 10; //but this b is always remain 10 until this class will exist
                        // it's memory allocation happen when the class is created
    //anything marked to static is always loaded first

    static void test(){
        //System.out.println(a);//this will give error because when this method will load a time of class
        //creation at that time a will be not exist
        System.out.println(b);
    }

    static{
        System.out.println("inside the static block");
    }

    //only because of static keyword we dont need to make a object for class main
    public static void main(String[] args) {
        myClass c1 = new myClass();
        System.out.println(c1.a);
    }

    static class myClass{
        int a =5;
    }

    /*
    Static can used for the following:
    1.static class
    2.static member (function and variable)
    3.static block
     */


}


