import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String args[]) {

        int[][] numbers = new int[2][3];
        numbers[0][1] = 1;
        System.out.println(Arrays.deepToString(numbers));
        
        int[][] num = { {1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(num));

        int[][][] num3 = new int[2][3][4];
        System.out.println(Arrays.deepToString(num3));
    }
}