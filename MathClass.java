
public class MathClass {
    
    public static void main(String[] args) {
        
        int result = Math.round(1.1F);
        System.out.println(result);

        int result2 = (int) Math.ceil(1.1F); // ceil returns smallest number greater than or eqaul to the current number 
        System.out.println(result2); // explicitly casting has int because ceil returns double but we are storing the result in an int 

        int result3 = (int) Math.floor(1.1F); // floor returns the largest int ie., smaller or equal to that num 
        System.out.println(result3);

        int result4 = Math.max(4, 7); // max returns greater of 2 values 
        System.out.println(result4);

        int result5 = Math.min(6, 9); 
        System.out.println(result5);

        double result6 = Math.random(); // random - generating a random value btw 0-1, returns double
        System.out.println(result6);

        double result7 = Math.random() * 100;// random numbers between 0 - 100
        System.out.println(result7);

        double result8 = Math.round(Math.random() * 100);
        System.out.println(result8);

        int result9 = (int) Math.round(Math.random() * 100); // round returns long
        System.out.println(result9);

        int result10 = (int) (Math.random() * 100);
        System.out.println(result10);
    }
}