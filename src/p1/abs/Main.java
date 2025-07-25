package p1.abs;

public class Main {
    public static void main(String[] args) {

        DieselCar d1 = new DieselCar();
        d1.start();
        d1.stop();

        ElectricCar e1 = new ElectricCar();
        e1.start();
        e1.stop();

        e1.end();
        d1.end();

        Car_interface C = new DieselCar();

        System.out.println("varable in interface:"+ C.a);
        System.out.println("varable in interface:"+ d1.a);



        //e1.test();


    }
}
