package Course;

public class Constructors {
    
    // constructor = special method that is called when an object is instantiated (created)

    String name;
    int age;
    double weight;

    Constructors(String name, int age, double weight){

        this.name = name;
        this.age = age;
        this.weight = weight;
        
    }

    void eat(){
        System.out.println(this.name + " is eating!");
    }

    void drink() {
        System.out.println(this.name + " is drinking!");
    }
}
