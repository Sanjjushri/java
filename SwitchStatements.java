public class SwitchStatements {
    
    public static void main(String[] args){
        //String role = "admin";
        int role = 1;

        switch (role){
            case 1:
            System.out.println("You're an admin");
            break;

            case 2:
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You're a guest");
        }
    }
}