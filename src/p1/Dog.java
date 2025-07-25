package p1;

public class Dog extends Animal {
    public Dog(){
        super(4,false,"black","woof","omnivore","mammal"); // using the super method is for inheriting the parent constructor
//        this.color = color;
//        this.klass = "mamalia";
//        this.noOfLegs = 4;
//        this.canFly = false;
//        this.sound = "woof";
//        this.dietPreference = "omniverse";
    }

    @Override
    public void test(){
        System.out.println("Inside the Dog class");
    }
}
