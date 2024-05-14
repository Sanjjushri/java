package Course;

public class ConstructorsCall {
    public static void main(String[] args){
        
        Constructors human1 = new Constructors("Rick", 65, 70);
        Constructors human2 = new Constructors("Rocky", 55, 60);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human2.eat();
        human1.drink();
    }
}
