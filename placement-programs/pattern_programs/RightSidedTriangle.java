// right sided increasing 
public class RightSidedTriangle {
    public static void main (String[] args){
        int n = 5;
        for (int i = 1; i<=n; i++) {
            for (int j = i; j<n; j++) {
                System.out.print("  "); //number of character in the print statement should be same
            }
            for (int j = 1; j<= i; j++) {
                System.out.print("* "); // two characters

            }
        System.out.println();
        }
    }
}
