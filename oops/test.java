package oops;

public class test {
    public static void main(String[] args) {
        car car = new car();
        car.color = "blur";
        car.speed = 34;
        car.model = "tata";

        car.accelerate(2);
        System.out.println(car.speed);

    }
    
}
