package lambdas;

public class MyClass implements MyFunctionalInterface {

    @Override
    public void test1() {
        System.out.println("Myclass - test1");
    }

    //VVI-> if a class have some own properties rather than just implemeting/
    //facilating the interface than in that case we can not use the
    //lambda function

//    @Override
//    public void test2() {
//        System.out.println("Myclass - test2");
//    }
//
//    @Override
//    public void test3() {
//
//    }

}
