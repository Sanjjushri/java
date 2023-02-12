/*
    Created on 12 feb 2023
    Course work: Find the missing number in an array.
    @author: Sanjjushri
    Source: https://www.studytonight.com/java-programs/java-program-to-identify-the-missing-number-in-a-given-array
*/

import java.util.*;

public class MissingNumber {

   
    public static void main(String[] args) {

        int arr_len;

        Scanner sc = new Scanner(System.in);
        arr_len = sc.nextInt();

        Integer[] arr = new Integer[arr_len];

        for (int i = 0; i < arr_len; i++) {
           arr[i] = sc.nextInt();
        }

        miss_num(arr, arr_len);
    }

    public static void miss_num(Integer arr[], int arr_len){
        int sum = (arr_len + 1) * (arr_len + 2)/2;
        System.out.println(sum);
        
        for(int i = 0; i < arr_len; i++){
            sum = sum - arr[i];
        }

        System.out.println("Missing number is: " + sum);
    }

}
