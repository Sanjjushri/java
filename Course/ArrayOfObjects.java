package Course;

public class ArrayOfObjects {
    
    public static void main(String[] args){

        // int[] numbers = new int[3]; // int array
        // char[] characters = new char[4]; // char array 
        // String[] strings = new String[5]; // Sttring array

        // Food[] refrigerator = new Food[3];
        
        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        Food[] refrigerator = {food1, food2, food3};

        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);



    }
}
