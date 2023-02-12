// source: https://www.tutorialspoint.com/move-all-the-zeros-to-the-end-of-array-in-java

import java.util.*;

public class ArrayEndZeros {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int arr_len = sc.nextInt();

        int[] arr = new int[arr_len];

        // System.out.println("Defaut values of array:");
        // for (int i = 0; i< arr.length; i++){
        //     System.out.print(arr[i]+ "\t");
        // }

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }

        int n = arr.length;
        func(arr, n);

    }

    public static void func(int arr[], int n){

        Arrays.sort(arr);

        for (int i = n-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}