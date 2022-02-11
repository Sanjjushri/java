
public class ForEachLoop {
    
    public static void main(String[] args){

        String[] fruits = {"Apple", "Mango", "Orange"};

        // if you need index use for loop
        for (int i = 0; i < fruits.length; i++)
           System.out.println(fruits[i]);

        // if index is not needed the use for each loop
        for (String fruit : fruits)
            System.out.println(fruit);
    }
}