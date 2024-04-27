package Course;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        System.out.print("I love pizza");
        System.out.println("It's really good!");
        System.out.print("Does this print in new line?");
        // escape sequencee for new line 
        System.out.print("hii the next one should be in new line\n");
        System.out.print("need to be in new line period");
        System.out.println("1\n");
        System.out.print("\t2");
        // if you want your text within double quotes 
        System.out.println("\"I love\" to explore");
    
        //  If you want to use backslashes in the output 
        System.out.println("\\hahaha");

        /*
         * 
         * 
         * 
         * This is for multi-line comments
         */


        //  VARIABLES:
        
        int x = 123; 

        System.out.println("My number is: " + x);

        long y = 48975453290L;

        byte z = 100;

        float h = 3.14f;
        
        double j = 3.7899;

        boolean l = false;

        char symbol = '@';

        // Reference datatypes begins with a capital letter
        String names = "Sanjjushri";
        
        System.out.println("Hello " +names);

        // Swap two variables 

        String a = "water";
        String b = "Kool-Aid";
        String temp;
        
        temp = a; 
        a = b;
        b = temp;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        // 4. User Input
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();


        System.out.println("Hello "+name);
        System.out.println("You are "+age+ " years old" );
        System.out.println("You like "+food);

        // 5. Expressions

        // expression = operands & operators 
        // operands = values, variables, numbers, quantity 
        // operators = + - * / % 

        int friends = 10; 

        friends = friends + 1;

        friends = friends /2;

        friends = friends % 3;

        friends++;

        friends--;

        double friend = 10;
        friend = (double) friend /3;

        System.out.println(friend);

        // 6. GUI (Graphical User Interface) Intro:

        

        

    }
}
