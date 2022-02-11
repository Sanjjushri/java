//Use while loop when you don't know how many times you want to execute the code block

import java.util.Scanner;

public class WhileLoop {
    
    public static void main (String args[]) {
        
        int i = 5;
        while (i > 0){
            System.out.println("Decrementing " + i);
            i--;
        }
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("quit")){

            System.out.print("Input: ");
            
            input = scanner.next().toLowerCase() ;

            System.out.println(input);
        }

        
    }
}