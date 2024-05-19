package Course;
import java.io.IOException;
import java.io.FileWriter;


public class FileWrtiter {
    public static void main(String[] args){

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue \nRockin' everywhere!");
            writer.append("\n(A poem by Sanjju)");
            writer.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
