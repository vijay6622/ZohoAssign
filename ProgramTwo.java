import java.util.Scanner;

public class ProgramTwo 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a n");
        int num = s.nextInt();
        for(int i=1;i<=26;i++)
        {
            System.out.print((char)(i+64));
        }
        for(int i=1;i<=num;i++)
        {
            System.out.print((char)(i+64));
        }
        
    }    
}
