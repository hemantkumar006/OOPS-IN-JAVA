package p1;

class Apartment{

    static String name = "hemant"; //the name is bound to Apartment class
    // not to apartment's object

    int noOfRooms;
    int noOfBalconies;
    String color;
    int floor;

    //A constructor in Java is a special method used to initialize objects.
    // It is called automatically when an object is created.
    Apartment(int noOfRoomsss, int noOfBalconies,String color, int floor){
        //when this keyword is used in constructor,then this keyword
        // refering to the object which is created due to this constructor
        this(); //this will call the non-paramterized private constructor
        this.noOfRooms = noOfRoomsss;
        this.noOfBalconies = noOfBalconies;
        this.color = color;
        this.floor = floor;
        System.out.println("with argument constructor");
    }

     Apartment(){
        System.out.println("without arguments constructor");
    }

    //function overloading
    public static int addNumbers(int a, int b){
      return a+b;
    }
    public static int addNumbers(int a, int b, int c){
        return a+b+c;
    }


    public static class MyStaticClass {
    }
}

public class OOP{
    public static void main(String[] args){
        //<class-name> object-name = new <Class-constructor>
        Apartment a1 = new Apartment(3,2,"Red",3);
        // this object will call contructor with arguments
//        a1.noOfRooms = 3;
//        a1.noOfBalconies = 2;
//        a1.color = "Red";
//        a1. floor = 3;

        Apartment a2 = new Apartment();//this will call constructor with no arguments
        a2.noOfRooms = 3;
        System.out.println(a2.noOfBalconies);
        a2.noOfBalconies = 2;
        System.out.println(a2.noOfBalconies);
        a2.color = "Red";
        a2. floor = 3;

        System.out.println(a2.addNumbers(4,5,6));


    }
}



/*
You go to a resturant and you see a menu
1.Chicken Biryani -- Class
2.Mutton Biryani
3.Veg Biryani

//chef is like a constructor

C1/C2/C3

C1: 1 VB + 1 CB -- Object
C2: 2 CB + 1 MB
C3: 1 CB + 1 MB + 1 VB

Class: A blueprint or idea to creating a object(it doesnt occupy the memory space)
In java everything is java


Object: It is exactly what we are creating on the basis of class idea and it is a  physical entity.

//Builder is like a constructor

//A public class, is the entry point of this file-code(partially true)
// main entry point is start with static void main statement

//A java file  have public class, then the java file name should same with
//java public class

//A non-public java class, only share within same package
 */


//Four piller in oop
//1. Inheritence
//2. Encapsulation
//3. Polymorphism -> Function Overriding
//                -> Function Overriding
//4. Abstraction

//polymorphism: the way it looks is one, but behave in many different ways.
