import java.util.Scanner;

public class ProgrameSeven
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = s.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i=i++)
        {
            int sumin=0;
            for(int j=1; j<=i;j=j++)
            {
                sumin += j;
            }
            sum += sumin;
        }
        System.out.println(sum);
    }
    
}
