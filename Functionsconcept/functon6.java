import java.util.*;
public class functon6 {
    public static int binCoeff(int n , int r){
        int fact_n = factorail(n);
        int fact_r = factorail(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n /( fact_r * fact_nmr);
return binCoeff;
    }
    public static void main(String args[]){
        System.out.println(binCoeff(5,2));
    }
    }
}
