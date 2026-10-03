package oops;

public class work {
    public static void main(String[] args) {
        car car = new car();
        car.color = "blue";
        car.year = 34;
        car.brand = "bmw";
        car.model = "bmee3";
        car.speed = 767;

        car.accelerate(1);
        System.out.println(car.speed);

        car.brake(10);
        System.out.println(car.speed);

    }
    
}
