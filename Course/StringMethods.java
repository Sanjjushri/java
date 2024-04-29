package Course;

public class StringMethods {
    
    public static void main(String[] args){

        // String = a reference data type that an store one or more characters 
        //          rerference data types have access to useful methods 

        String name = "Sanjju";

        boolean result = name.equalsIgnoreCase("sanjju");
        int results = name.length();
        char rst = name.charAt(0);
        int value = name.indexOf("u");
        boolean val = name.isEmpty();
        String to_upper = name.toUpperCase();
        String to_lower = name.toLowerCase();
        String rep_str = name.replace('u', 'j');

        System.out.println(to_upper);
    }
}
