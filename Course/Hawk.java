package Course;

public class Hawk implements Predator{

    @Override
    public void hunt() {

        System.out.println("The hawk is hunting");
        
        Hawk hawk = new Hawk();

        hawk.hunt();
        
    }
    
    
}
