import java.util.Scanner;

public class UC2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter x and y values of 1st line");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        int num1 = x2 - x1;
        int num2 = y2 - y1;
        int length1=num2-num1;

        System.out.println("ENter x and y values of 2nd line");
        int v1 = scan.nextInt();
        int w1 = scan.nextInt();
        int v2 = scan.nextInt();
        int w2 = scan.nextInt();

        int num3 = v2 - v1;
        int num4 = w2 - w1;
        int length2=num4-num3;

        if(length1==length2){
            System.out.println("Length is same");
        }
       else{
            System.out.println("Length is not same");
        }
    }
}