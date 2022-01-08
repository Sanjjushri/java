
public class Strings {
    
    public static void main(String agrs []){
        
        // String message = new String("Hello World");
        // System.out.println(message);
        String message = "  Hello World" + "!!  ";

        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("!", "*")); // replace (target , replacement)
        System.out.println(message.toLowerCase());
        System.out.println(message); // original message will not be changed because in java Strings are immutable
        System.out.println(message.toUpperCase()); 
        System.out.println(message.trim()); // get rid of extra white spaces at the beginning or end of the string 

     }
}