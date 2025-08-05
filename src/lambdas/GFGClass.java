package lambdas;

public class GFGClass implements MyFunctionalInterface{

    public String name = "GFG";

    @Override
    public void test1() {
       System.out.println("GFGClass test1");
    }

    //VVI-> if a class have some own properties rather than just implemeting/
    //facilating the interface than in that case we can not use the
    //lambda function

//    @Override
//    public void test2() {
//        System.out.println("GFGClass test2");
//    }
//
//    @Override
//    public void test3() {
//        System.out.println("GFGClass test3");
//    }
//
//    public void test4(){
//        System.out.println("GFGClass test4");
//    }
}
