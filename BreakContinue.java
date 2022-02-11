import java.util.Scanner;
 
public class BreakContinue {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true ){

            System.out.print("Input: ");
            
            input = scanner.next().toLowerCase() ;

            // if (!input.equals("quit"))
            //     System.out.println(input);

            if (input.equals("pass"))
                // moves control to the begining of the loop
                continue;  

            if (input.equals("quit"))
                // break terminates the loop
                break;

            System.out.println(input);
        }
    }
}