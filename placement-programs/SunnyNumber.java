/*
    Created on 12 Feb 2023
    Course work: To check if a number is Sunny number or not.
    @author: Sanjjushri
    Source: codevscolor.com/java-check-sunny-number
 */

import java.util.*;

public class SunnyNumber {
    public static void main(String[] args){

        int num;

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        double sqrt_val = Math.sqrt(num + 1);
        double floor_val = Math.floor(sqrt_val);

        if (sqrt_val - floor_val == 0){
            System.out.println("It is a sunny number");
        }
        else{
            System.out.println("It is not a sunny number");
        }
    }
}
