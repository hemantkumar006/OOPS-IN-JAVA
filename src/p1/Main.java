package p1;

import exceptions.HemantException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SyncFailedException;
import java.util.regex.PatternSyntaxException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            int a = 0;
            int b = 10;
            printDivision(a, b);
            myTestFunction(5, 3);

            //Finally real life example
            //Akshay software start
            //shantanu software connection established
            //use shantanu software (can throw exception)
            //Usage complete
            //break shantanu s/w connection
        }catch(Exception e){
            //break shantnu software connections
            //Handle shantanu software exception

            System.out.println(e.getMessage() +" Handle in main throw by the mytestfunction");
        }finally {
            //break shantanu software connection

            //finally without try  is not possible,
            //try without catch is not possible
            //catch without try is not possible
            System.out.println("coming from finally block!!");

        }
    }
        public static void printDivision(int x, int y){
        //always try to find the doubtful code
            // start exception handling
            try {
                //so the doubtful code we place that in try block
                System.out.println(y / x);
                Apartment a = null;
                a.floor = 3;
            }catch(ArithmeticException  e){
                // e is instance of exceptions
                //how u handle the exceptions , written in the catch block
                System.out.println("Airthmatic  exceptions happening");
                printDivision(2,10);
                //in order to handle the exceptions we write something catch
                //and inside the round bracket, we write the kind of exceptions we want to handle
            }catch(NullPointerException| PatternSyntaxException e){
                System.out.println("NullPointerException or PatternSyntaxException exceptions happeing");
            }
    }

    //Compile time exceptions
    public static void printLinesFromTerminal(){
        //if any piece of code throw compile time exception , it has to be handle
        //java is manadate for u , u have to handle the compile time exceptions
        //if u not handle compile time exceptions , java will throw an error
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            br.readLine();
        }catch(IOException e){

        }
    }

//    public static void myTestFunction(int a, int b)  {
//        try {
//            if (a < b) {
//                System.out.println("a is less tha b");
//            } else {
//                //throw keyword is used , when as a developer u want to throw an exceptions
//                //whenever a function can a throw a compile time exception then exception should be handle
//                //first way to handle the exception , in the same code using the catch
//                //second way to handle using the throws keyword,
//                //like :->  public static void myTestFunction(int a, int b) throws Exception {
//                //throws: this keyword is going to tell, that whenever this particular function called from
//                //any other function , then that function to handle the exception
//                //house owner tell to renter fixed the fan -> real life example
//                throw new Exception("Hemant's exceptions");
//            }
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//    }

    //throws : when we use throws then it is mandate that the caller function must have to handle the exception
    //compile time exception must be handle in java otherwise the java give error(will not compile), it is mandate
    // return and throw statement is terminating statement, whatever written below it , that will not run


    public static void myTestFunction(int a, int b)  throws Exception {

            if (a < b) {
                System.out.println("a is less tha b");
            } else {
                //throw keyword is used , when as a developer u want to throw an exceptions
                //whenever a function can a throw a compile time exception then exception should be handle
                //first way to handle the exception , in the same code using the catch
                //second way to handle using the throws keyword,
                //like :->  public static void myTestFunction(int a, int b) throws Exception {
                //throws: this keyword is going to tell, that whenever this particular function called from
                //any other function , then that function to handle the exception
                //house owner tell to renter fixed the fan -> real life example
                //throw new Exception("Hemant's exceptions");
                //Exception e  = new Exception("Hemant's exceptions");
                // throw e so it means u catch the object of the exception

                HemantException e_msg =  new HemantException("hemant exceptions message ");
                throw e_msg;
            }
    }
}