import java.util.Scanner;

public class ProgramTwelve 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a n");
        int n = s.nextInt();
        float sum=0;
        for(int i=1;i<n;i++)
        {   float divi = (float)i/(i+1);
            sum += divi;
        }
        System.out.println(sum);
    } 
}
