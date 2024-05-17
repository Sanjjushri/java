package Course.Package1;
import Course.Package2.*;

public class AccessModifiers {
    // access modifier adds security to our program 

    public static void main(String[] args){

        C c = new C();
        System.out.println(c.publicMessage);

        B b = new B();
        // System.out.println(b.privateMessage);

    }

    protected String protectedMessage = "This is protected ";

}
