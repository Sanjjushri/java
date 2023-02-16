/*
    Created on 17 Frb 2023
    Course work: Binary Search
    @author: Sanjjushri
    Source: https://www.geeksforgeeks.org/binary-search/
*/

import java.util.*;

public class BinarySearch {

    int binarySearch(int arr[], int l, int r, int x){
        
        if (r >= 1){
            int mid = l + (r-1) / 2;

            if (arr[mid] == x)
                return mid;

            if (x > arr[mid])
                return binarySearch(arr, mid +1, r, x);

            return binarySearch(arr, l, mid - 1, x);
        }

        return -1;
    }
    public static void main(String[] args){
        
        BinarySearch bs = new BinarySearch();
        
        Scanner sc = new Scanner(System.in);

        int arr_len = sc.nextInt();

        int[] arr = new int[arr_len];

        for (int i =0; i < arr_len; i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int result = bs.binarySearch(arr, 0, arr_len-1, x);

        if (result == -1){
            System.out.println("Not present");
        }

        else
            System.out.println("element index"+ result);

    }
}
