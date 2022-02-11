
import java.util.Scanner;

public class DoWhileLoops {
    
    public static void main (String[] args){
        
        Scanner scanner = new Scanner(System.in);
        String input = "";

//In do while the loop will get executed atleast once because the condition will be checked at the last
       
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
    
        } while (!input.equals("quit"));
    }
}