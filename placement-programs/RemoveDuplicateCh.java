/*
    Created on 13 Feb 2023
    Course work: To Remove Duplicate characters in a given string
    @author: Sanjjushri
    Source: https://www.geeksforgeeks.org/java-program-to-remove-duplicates-from-a-given-string/
*/

import java.util.*;

public class RemoveDuplicateCh {

    public static void removeDuplicates(String str){
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();

        for(int i=0; i<str.length(); i++){
            lhs.add(str.charAt(i));
        }

        for(Character ch : lhs){
            System.out.print(ch);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inp_str = sc.nextLine();

        removeDuplicates(inp_str);
    }
}
