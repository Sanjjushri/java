/*
 Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words, prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.

source: https://www.javatpoint.com/prime-number-program-in-java
*/

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args){
        int num, m=0, flag=0;

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        m = num/2;

        if(num==0 || num==1){
            System.out.println(num+" is not prime number");
        }
        else{
            for(int i = 2; i<=m; i++){
                if(num%i == 0){
                    System.out.println(num+ " is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(num+" is a prime number");
            }
        }
         
    }
}
