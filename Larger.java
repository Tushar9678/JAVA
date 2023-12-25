import java.util.Scanner;

public class Larger{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Find the largest number
        int max = a;
        if(b>max){
            max= b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("Max Number is: "+ max);
    }
}