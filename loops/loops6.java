import java.util.*;
public class loops6 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum=0;
        int i =1;
        while(i<=n){
            sum += i;   // sum = sum +1;
            i++;
        }
        System.out.println("sum is: "  + sum);
    }
}
