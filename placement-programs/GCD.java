/*
Source: https://www.javatpoint.com/java-program-to-find-gcd-of-two-numbers
 */

import java.util.*;

public class GCD{
    public static void main(String[] args){

        int x, y, gcd = 1;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        for(int i=1; i<=x && i <= y; i++){
            if(x%i == 0 && y%i == 0){
                gcd = i;
            }
        }
        System.out.println("GCD: " + gcd);
    }
}