import java.util.Scanner;

public class ReadingInput {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in); //to read it from the terminal window we use Sysytem.in, System.out to prt smthg on the terminal
        
        //scanner.nextFloat()
        //scanner.nextDouble()

        System.out.print("Your full name : ");
        String input = scanner.nextLine().trim(); // chaining multiple methods
        System.out.println("You're name is " + input);

        System.out.print("name : ");
        String name = scanner.next();
        System.out.println("You are " + name);

        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);

    }
} 