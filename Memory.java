import java.awt.*;

public class Memory{

    public static void main(String args[]){
        
        byte x = 1;
        //x = 2;
        byte y = x;
        x = 2;
        System.out.println(y);

        Point point1 = new Point(1, 1);
        Point point2 = point1; // here point1 will store the address or the reference to the point object in memory
        //System.out.println(point2);
        point1.x = 2;
        System.out.println(point2);
    }
}