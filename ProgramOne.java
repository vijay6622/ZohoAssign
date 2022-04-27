import java.util.Scanner;

public class ProgramOne
{
    public static void main(String[] args) 
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        s.close();
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}