
public class ArithmeticExpressions {
    
    public static void main(String[] args){

        int result1 = 10 + 3;
        System.out.println(result1);

        int result2 = 10 - 3;
        System.out.println(result2);

        int result3 = 10 * 3;
        System.out.println(result3);

        int result4 = 10 / 3; //In java the division of two whole numbers is a whole number 
        System.out.println(result4);

        double result5 = (double) 10 / (double) 3;
        System.out.println(result5);

        int x = 1;
        x++; // or ++x
        System.out.println(x);

        int y = 1;
        int z = y++; // z is assigned then y is incremented
        System.out.println(y);
        System.out.println(z);

        int a = 1;
        int b = ++a; //a is incremented then assigned to b
        System.out.println(a);
        System.out.println(b);

        int c = 1;
        c += 2;
        System.out.println(c);
    }
}