package p1.abs;

public interface Car_interface {
     void start();

     void stop();

     default void end(){
         System.out.println("Default method in interface");
     }

     //varable in interface is final static by default
     int a =5;
}
