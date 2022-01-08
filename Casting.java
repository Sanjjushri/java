public class Casting {

    public static void main(String[] args) {
        
        // Implicit Casting : means automatic casting (automatic converion)
        // byte -> short -> int -> long -> double
        short x = 1;
        int y = x + 2; //short: 2bytes , int: 4bytes
        System.out.println(y);

        double c = 1;
        double d = x + 2;  // 2 is coverted to double
        System.out.println(d);

        //Explicit Casting 
        double  a = 1.1;
        int b = (int)a + 2;
        System.out.println(b);

        String e = "1";
        int f = Integer.parseInt(e) + 2;
        System.out.println(f);

        String g = "1.1";
        double h = Double.parseDouble(g) + 2;
        System.out.println(h);
    }
}