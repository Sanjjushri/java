package Course;

public class ObjectPassing {

    public static void main(String[] args){
        Garage garage = new Garage();

        Cars car1 = new Cars("BMW");
        Cars car2 = new Cars("Tesla");

        garage.park(car1);
        garage.park(car2);


    }
}
