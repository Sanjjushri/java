/*
    Created on 12 feb 2023
    Course work: Sort an Array in Ascending Order
    @author: Sanjjushri
    Source: https://stackhowto.com/java-program-to-sort-an-array-in-ascending-and-descending-order/
 */

import java.util.*;

public class AscendingOrder {
    public static void main(String[] args){
        int arr_len; 

        Scanner sc = new Scanner(System.in);
        arr_len = sc.nextInt();

        int[] arr = new int[arr_len];

        for(int i =0; i < arr_len; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.printf("Sorted Array: %s", Arrays.toString(arr));
    }
}
