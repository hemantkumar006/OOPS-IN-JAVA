package p1;

public class Encapsulation {

    //imagine you have a very big box inside this box u kept the apple
    //inside this box there is a small box in smaller box there is a orange
    //so from orange box or smaller box we can see the apple
    //but apple box can not see the orange
    //this is exactly encapsulation is, in coding or technical
    //it is like we can access everything outside the box but from
    //outside we can not access the inside box

    int a  =5;

    {
        System.out.println(a);
        int b =10;
        System.out.println(b);
    }
    //b = 5;//we can not access b from outside the box

    public static void main(String[] args) {
        System.out.println("Hello");
        Encapsulation e1 = new Encapsulation();


    }
}
