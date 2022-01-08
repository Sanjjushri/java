
public class EscapeSequences {

    public static void main (String[] args){

        String message = "Hello \"Sanjju\"";
        System.out.println(message);

        String msg2 = "c:\\Windows\\..";
        System.out.println(msg2);

        String msg3 = "c:\nWindows\\..." ;
        System.out.println(msg3);

        String msg4 = "c:\tWindows\\...";
        System.out.println(msg4);
    }
}