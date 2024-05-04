package Course;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args){
        
        // for-each = traversing technique to iterate through the elements in an array/collection 
        //            less steps, more readable 
        //            less flexible 

        String[] animals = {"cat", "dog", "rat", "bird"};

        for(String i: animals){
            System.out.println(i);
        }

        ArrayList<String> animals_list = new ArrayList<String>();

        animals_list.add("rat");
        animals_list.add("cat");
        animals_list.add("dog");
        
        for(String i : animals_list){
            System.out.println(i);
        }

    }
}
