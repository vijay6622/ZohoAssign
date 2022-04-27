import java.util.Scanner;

public class ProgramEleven
{
    public static void main(String[] args)
    { 
    
         Scanner s = new Scanner(System.in); 
         System.out.println("Enter a number:");
         long n = s.nextLong();
         long sum =0l;
         for(int i=1; i<=n; i=(i*10)+1)
         {
            sum += i;
         } 
         System.out.println(sum);
    }
}