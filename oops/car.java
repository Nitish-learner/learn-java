package oops;
public  class car {

    String color;
    String brand;
    String model;
    int year;
    int speed;

    public void accelerate(int increment){
        speed += increment;
    }
    public void brake(int decrement) {
        speed -= decrement;
        if (speed <  0) {
            speed = 0;
        }
    }

    public static void main(String[] args) {
        
    }
}
