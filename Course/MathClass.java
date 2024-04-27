package Course;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args){

        double x = 3.14;
        double y = 10;

        double z = Math.max(x, y);
        double w = Math.min(x, y);
        double h = Math.sqrt(y);
        double s = Math.round(x);
        double t = Math.ceil(x);
        double u = Math.floor(x);

        System.out.println(z);
        System.out.println(w);
        System.out.println(h);
        System.out.println(s);
        System.out.println(t);
        System.out.println(u);

        // find hypotenuse of a triangle 

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter die y: ");
        y = scanner.nextDouble();

        c = Math.sqrt((x*x) + (y*y));
        
        System.out.println("The hypotenues is : "+c);

        scanner.close();

    }
}
