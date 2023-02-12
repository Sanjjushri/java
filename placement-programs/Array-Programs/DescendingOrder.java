/*
    Created on 12 Feb
    Course work: Sort an Array in Descending Order
    @author: Sanjjushri
    Source: https://stackhowto.com/java-program-to-sort-an-array-in-ascending-and-descending-order/
 */

import java.util.*;

public class DescendingOrder {
    public static void main(String[] args){
        int arr_len;

        Scanner sc = new Scanner(System.in);
        arr_len = sc.nextInt();

        Integer[] arr = new Integer[arr_len];

        for (int i = 0; i < arr_len; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}
