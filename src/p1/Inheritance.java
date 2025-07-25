package p1;

public class Inheritance {
    public static void main(String[] args){
        Animal a1 = new Animal(4,false,"fawn","woof","omniverce","mamalia");
//        Animal p2 = new Animal(4,false,"fawn","meow","omniverce","mamalia");
//        Animal p3 = new Animal(4,false,"black","screech","omniverce","mamalia");

//        Dog d1 = new Dog(4,false,"Black","omnivore","mamalia");
        Dog d1 = new Dog();//here using the super keyword intializing the value
        System.out.println("Dogs:" +d1.canFly);
        System.out.println("Dogs:" +d1.color);
        System.out.println("Dogs:" +d1.klass);
        d1.test();


    }
}
