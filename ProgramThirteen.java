import java.util.Scanner;

public class ProgramThirteen 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  the number:");
        int num = s.nextInt();
        int sum=0;
        for(int i=1 ; i<=num; i++)
        {
            sum += i*i*i;
        }
        System.out.println(sum);
    }    
}
