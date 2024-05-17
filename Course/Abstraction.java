package Course;

public class Abstraction {
    
    public static void main(String[] args){

        // abstract = abstract classes cannot be instantiated, but they can have a subclass 
        //            abstract methods are declared without an implementation 

        // AbtVehicle vehicle = new AbtVehicle();

        abtCar car = new abtCar();

        car.go();

    }
}
