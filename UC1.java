import java.util.Scanner;

public class UC1 {
    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation");
        Scanner a=new Scanner(System.in);
        int x1 = a.nextInt();
        Scanner b =new Scanner(System.in);
        int y1 = b.nextInt();
        Scanner c=new Scanner(System.in);
        int x2 = c.nextInt();
        Scanner d=new Scanner(System.in);
        int y2 = d.nextInt();

        double length=Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        System.out.println(length);
    }
}
