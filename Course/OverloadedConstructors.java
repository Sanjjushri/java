package Course;

public class OverloadedConstructors {
    
    String bread;
    String sauce;
    String cheese;
    String topping;

    OverloadedConstructors(){

    }


    OverloadedConstructors(String bread){

        this.bread = bread;
    }

    OverloadedConstructors(String bread, String sauce){

        this.bread = bread;
        this.sauce = sauce;
    }

    OverloadedConstructors(String bread, String sauce, String cheese){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    OverloadedConstructors(String bread, String sauce, String cheese, String topping){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
    
}
