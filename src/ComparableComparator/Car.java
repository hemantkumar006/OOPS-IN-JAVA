package playground;

public  class Car implements Comparable<Car>{

    public double price;

    public Car(double price){
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        return (int) (this.price - o.price);
    }
}
