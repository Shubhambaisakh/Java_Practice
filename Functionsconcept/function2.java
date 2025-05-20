/*import java.util.*;

public class function2{
    public static void printHelloworld(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }

    public static void calculatesum(){
           Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is : " + sum);
    }
    public static void main(String args[]){
       calculatesum();
        
    }
}
*/


import java.util.*;


public class function2{
    public static void printHelloworld(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }

    public static int calculatesum( int num1 , int num2 ){
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum = calculatesum(a, b);
       System.out.println("sum is : " + sum); 
    }
}