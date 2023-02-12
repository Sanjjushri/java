/*
    Created on 12 Feb 2023
    Course work: Check if a number is a tech number or not.
    @author: Sanjjushri
    Source: https://www.codevscolor.com/java-program-check-tech-number

    For example, 9801 is a tech number.
        Divide it in two parts: 98 and 01.
        Add the parts: 98 + 01 = 99
        Find the square of 99: 9801

 */

import java.util.*;

public class TechNumber {
    public static void main(String[] args){
        int num, temp, totalDigits = 0;
        
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        temp = num;

        while (temp > 0){
            totalDigits++;
            temp = temp/10;
        }

        if (totalDigits % 2 == 0){
            int div = (int) Math.pow(10, totalDigits/2);
            // System.out.println(div);

            int firstHalf = num / div;
            int secHalf   = num % div;

            int sumSq = (firstHalf + secHalf) * (firstHalf + secHalf);

            if (sumSq == num){
                System.out.println(num + " is a tech number");
            }

            else{
                System.out.println(num + " is not a tech number");
            }
        }

        else{
            System.out.println(num + " is not a tech number");
        }
    }
}
