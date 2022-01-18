public class TernaryOperator {
    
    public static void main (String[] args){
        int income = 120_000;
        // tenary operation -- condition? : if the condition True : if the condition is False
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);
    }
}