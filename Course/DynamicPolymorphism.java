package Course;
import java.util.Scanner;

public class DynamicPolymorphism {
    
    public static void main(String[] args){

        // polymorphism = many shapes/forms 
        // dynamic = after compilation (during runtime)

        // ex. A corvette is a: corvette, and a car, and a vehicle, and an object 
        // Dynamic Polymorphism 

       Scanner scanner = new Scanner(System.in);
       Animal animal; 

       System.out.println("What animal do you want?");
       System.out.println("(1=dog) or (2=cat): ");
       int choice = scanner.nextInt(); 

       if(choice==1){
            animal = new Dog();
            animal.speak();
       }

       else if(choice==2){
            animal = new Cat();
            animal.speak();
       }

       else {
        animal = new Animal();
        System.out.println("That coice was invalid");
        animal.speak();
       }

       
    }

}
