import java.util.*;

public class NCRCalculator {

    static int nCr(int n, int r)
    {
        return fact(n) / (fact(r) * fact(n-r));
    }

    static int fact(int n)
    {
        int res = 1;
            for (int i = 2; i<= n; i++) {
                res = res * i;
            }
            return res;
    }
    public static void main(String[] args){
        int n, r;

        // n!/ r! * (n-r)!
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        r = sc.nextInt();

        System.out.println("nCr = "+nCr(n, r));
    }
}
  