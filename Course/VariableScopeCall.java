package Course;

import java.util.Random;

public class VariableScopeCall {
    
    Random random;
    int number;

    VariableScopeCall(){

        random = new Random();
        roll();

    }

    void roll(){

        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

}
