package Course;

public class Encapsulation {
    
    public static void main(String[] args){

        //Encapsulation = attributes of a class will be hidden or private, 
        //                Can be accessed only throuhg methods (getters and setters)
        //                You should make attributes private if you don't have a reason to make them 
    
        EncapCar car = new EncapCar("Chevrolet", "Camaro", 2021);

        car.setYear(2022);
        
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}
