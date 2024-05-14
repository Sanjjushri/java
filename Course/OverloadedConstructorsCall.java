package Course;

public class OverloadedConstructorsCall {
    
    public static void main(String[] args){

        // overloaded constructor = multiple constructors within a class with the same name, 
        //                          but have different parameters
        //                          name + parameters = signature 

        OverloadedConstructors pizza = new OverloadedConstructors("thicc crust", "tomato", "mazzerella");

        System.out.println("Here are the ingrdients of your pizza");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);





    }
}
