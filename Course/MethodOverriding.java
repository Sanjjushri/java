package Course;

public class MethodOverriding {
    
    // Method Overriding = Declaring a method in sub class, 
    //                     which is already present in parent class 
    //                     done so that a child class can give its own implementation 

    public static void main(String[] args){

        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.speak();
        animal.speak();
    }

}
