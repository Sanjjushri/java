public class IfStatements {
    
    public static void main (String[] args){

        int temp = 21;
        if (temp > 30){
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        } 
        else if (temp > 20) // braces are only required if have multiple statements
            System.out.println("Beautiful day");
        else 
            System.out.println("Cold day");
    }
}