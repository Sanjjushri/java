/*
    Created on 
    Course work: 
    @author: Sanjjushri
    Source: 
 */

import java.util.*;

public class ReverseStr {

    public static void main(String[] args){
        String nstr="";

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(ch);
            nstr = ch + nstr;
            System.out.println(nstr);
        }

        System.out.println(nstr);

    }
}
