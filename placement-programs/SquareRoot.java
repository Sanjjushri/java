/*
    Created on 12 Feb 2023
    Course work: To Find Square root of a Number
    @author: Sanjjushri
    Source: https://www.scaler.com/topics/square-root-in-java/
 */

import java.util.*;

public class SquareRoot {

    public static void main(String[] args){
        Double num;

        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();

        Double ans = Math.sqrt(num);

        System.out.println("The square root is "+ ans);
    }
}
