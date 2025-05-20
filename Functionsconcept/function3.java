import java.util.*;
public class function3 {
    public static void printHelloworld(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }

    public static int calculatesum( int num1 , int num2 ){
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static void main(String args[]){
        // swap- values exchange
        int a = 5;
        int b = 10;
        swap(a,b);
    }
}

