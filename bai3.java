import java.util.Scanner;
public class bai3 {
    public static void nhiphan(int n)
    {
        if(n==1)
            System.out.print(1);
        else
        {
            nhiphan(n/2);
            System.out.print(n%2);
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
        nhiphan(n);
    }
}
