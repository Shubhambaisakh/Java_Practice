//Display all the number enterd by the user except multiple if 10

import java.util.Scanner;

public class loops13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      
        do{
            System.out.println("enter your number:");
            int n = sc.nextInt();

            if(n%10==0){
                continue;
            }
            System.out.println( " numderwas : " + n);
        } while(true);
    }
}
}
