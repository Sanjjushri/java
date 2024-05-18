package Course;

public class InterfaceImple {
    
    public static void main(String[] args){

        // interface = a template that can be applied to a class 
        //             similar to inhertitance, but sepcifies what a class has/must do. 
        //             classes can apply more than one interface, inheritance is limited to 1 super class
    

        // Rabbit rabbit = new Rabbit();
        // rabbit.flee();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
        
    }
}
