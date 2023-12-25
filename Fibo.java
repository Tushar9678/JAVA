import java.util.Scanner;

public class Fibo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a= 0;
        int b=1;
        int count = 2;
        int n = in.nextInt();

        while(count<= n){
            int temp = b;
            b= b+a;
            a= temp;
            count++;

        }   
    System.out.println(b);

    }
}
