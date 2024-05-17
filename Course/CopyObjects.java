package Course;

public class CopyObjects {
   
    public static void main(String[] args){
        EncapCar car1 = new EncapCar("Chevrolet", "Camaro", 2011);
        // EncapCar car2 = new EncapCar("Ford", "Mustang", 2022);

        // car2 = car1;

        // car2.copy(car1);

        EncapCar car2 = new EncapCar(car1); 

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }

}
