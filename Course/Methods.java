package Course;

public class Methods {
    public static void main(String[] args){

        // method = a block of code that is executed whenever it is called upon 
        String name = "Sanjju";
        int age = 21;

        hello(name, age);

        int x = 3;
        int y = 4; 
  
        System.out.println(add(x,y));
    }

    static int add(int x, int y){

        int z = x + y;
        return z;
    }

    static void hello(String title, int age) {
        System.out.println("Hello " + title);
        System.out.println("You are " + age);

    }



}
