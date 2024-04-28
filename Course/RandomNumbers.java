package Course;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args){

        Random random = new Random();

        int x = random.nextInt();
        int y = random.nextInt(6)+1; // random number between 0 to 6
        double z = random.nextDouble(); // random values between 0 and 1 
        boolean b = random.nextBoolean(); // True or False 

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(b);
        
         
    }
}
