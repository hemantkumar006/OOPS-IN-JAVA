package p2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       MyStaticClass S1 = new MyStaticClass();

       System.out.println(S1.a);
       S1.a = 20;
       System.out.println(S1.a);

       MyStaticClass S2 = new MyStaticClass();
       System.out.println(S2.a);

       S2.test();
    }
}