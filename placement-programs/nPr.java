import java.util.*;

public class nPr {
    public static void main(String[] args){
        int n, r, nfact=1, nrfact=1, num;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        r = sc.nextInt();

        for(int i = 1; i<=n; i++){
            nfact = nfact * i;
        }

        num = n - r;

        for(int i=1; i <= num; i++){
            nrfact = nrfact * i;
            
        }

        // System.out.println(nfact);
        // System.out.println(nrfact);
        
        int per = nfact/nrfact;
        System.out.printf("nPr: %d", per);
    }
    
}
