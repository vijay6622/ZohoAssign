import java.util.Scanner;

public class ProgramNine 
{
    public static void main(String[] args) 
    {
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        int sum = 0;
        s.close();
        for(int i=5;i<=n;i=i+5)
        {
            sum += i*i;
        }
        System.out.println(sum);
    }   
}
