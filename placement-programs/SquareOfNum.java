/*
    Created on 12 Feb 2023
    Course work: To Find Square of a Number
    @author: Sanjjushri
    Source: https://www.scaler.com/topics/square-root-in-java/
 */

import java.util.*;

public class SquareOfNum { 
    public static void main(String[] args){
        double num, ans;

        Scanner sc = new Scanner(System.in);

        num = sc.nextDouble();
        ans = Math.pow(num, 2);

        System.out.println("Double of " + num + " is " + ans);
    }
}