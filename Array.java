import java.util.Arrays;

public class Array {
    
    public static void main(String[] agrs) {

        int[] numbers = new int[5]; // length of the array inside int[]
        numbers[0] =1;
        numbers[1] = 2;
        System.out.println(numbers); //by default when we print an array Java returns the String which is 
                                    //calculated based on th address of this object in memory
                                   //so if you have another array and we print that we're gonna see differnt value
        
        System.out.println(Arrays.toString(numbers));  // toString method id implemented multiple times (method overloading)

        int[] num = {2, 3, 5, 1, 4};
        System.out.println(num.length); // Arraya have fixed size so once we create them we cannot add or remove additional items to them.
                                       // if we want to add or remove we need to use one of the collection classes

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(num));


    }
}

