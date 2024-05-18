package Course;
import java.io.File;

public class FileClass {
    // file = An abstract representation of file and directory pathnames

    public static void main(String[] args){
        File file = new File("secret_message.txt");

        if (file.exists()) {

            System.out.println("That file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();

        }

        else{
            System.out.println("That file doesn't exist");
        }

    }




}
