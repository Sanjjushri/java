/*
    Created on 13 feb 2023
    Course work: Linear Search
    @author: Sanjjushri
    Source: 
*/

import java.util.*;

public class LinearSearch {
    public static void main(String[] args){
        int ele = -1;
        Scanner sc = new Scanner(System.in);
        int arr_len = sc.nextInt();

        int[] arr = new int[arr_len];

        for(int i = 0; i<arr_len; i++){
            arr[i] = sc.nextInt();
        }
        
        int key = sc.nextInt();

        for(int i=0; i<arr_len; i++){
            if(arr[i] == key){
                ele = i;
                System.out.println("Index is: "+ele);
            }
        }

        if(ele == -1){
            System.out.println("Element is not present");
        }
    }
}
