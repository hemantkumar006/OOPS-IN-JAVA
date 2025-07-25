package p1;

//public final class Animal { //final class can not be inherited
public  class Animal {
    int noOfLegs;
    boolean canFly;
    String color;
    String sound;
    String dietPreference;
    String klass;

    public Animal(int noOfLegs, boolean canFly, String color,String sound, String dietPreference, String klass){
        this.noOfLegs = noOfLegs;
        this.canFly = canFly;
        this.color = color;
        this.dietPreference = dietPreference;
        this.klass = klass;
        this.sound = sound;

    }

    public Animal(){

    }

    //final method can not be overriden
    public void test(){
        System.out.println("Inside the Animal class");
    }

}
