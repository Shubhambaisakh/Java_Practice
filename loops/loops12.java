// Keep entering number till user enter a multile of 10

import java.util.*;

public class loops12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      
        do{
            System.out.println("enter your number:");
            int n = sc.nextInt();

            if(n%10==0){
                break;
            }
            System.out.println();
        } while(true);
    }
}
