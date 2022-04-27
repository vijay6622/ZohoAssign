import java.util.Scanner;

public class ProgramEight 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        s.close();
        float sum=0;
        for(int i = 1; i<=n ; i++)
        {
            if (i%2 == 1)
            {
                sum = sum + (n/(n+1));
            }

            else
            {
                sum = sum - (n/(n+1));
            }
        }
        System.out.println(sum);
             
    }
}
