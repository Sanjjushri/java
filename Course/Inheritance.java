package Course;

public class Inheritance {
    
    // inheritance = the process where one class acquires, 
    //               the attributes and methods of another 

    public static void main(String[] args){
        Bike car = new Bike();

        car.go();

        Bicycle bike = new Bicycle();

        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);

        System.out.println(car.doors);
        System.out.println(bike.pedals);

    }


}
