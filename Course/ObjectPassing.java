package Course;

public class ObjectPassing {
    
    public static void main(String[] args){

        Garage garage = new Garage();

        Cars car = new Cars("BMW");

        garage.park(car);
    }
}
