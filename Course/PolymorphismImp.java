package Course;

public class PolymorphismImp {
    
    public static void main(String[] args){

        // polymorphism = greek work for poly-"many", morph-"form"
        //                The ability of an object to identify as more than one type 


        PCar car = new PCar();
        PBicycle bicycle = new PBicycle();
        PBoat boat = new PBoat();

        PVehicle[] racers = {car, bicycle, boat};

        //   car.go();
        //   bicycle.go();
        //   boat.go();

        for(PVehicle x : racers){
            x.go();
        }
        
    }
}
