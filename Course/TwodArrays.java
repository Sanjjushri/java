package Course;

public class TwodArrays {
    public static void main(String[] args) {
        // 2D array = an array of arrays 

        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][2] = "Ranger";
        cars[1][3] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][2] = "Lambo";
        cars[2][3] = "Tesla";
        
        for(int i=0; i<cars.length; i++) {
            System.out.println();
            for(int j=0; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }

        }

        String[][] car = {  {"Camaro", "Corvette", "Silverado"},
                            {"Mustang", "Ranger", "F-150"}, 
                            {"Ferrari", "Lambo", "Tesla"}
                        };

    }

}
