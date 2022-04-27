import java.util.Scanner;

public class ProgramFour 
{
   public static void main(String[] args) 
   {
       Scanner s= new Scanner(System.in);
       System.out.print("enter a number");
       int num=s.nextInt();
       s.close();
       int sum = 0;
       for(int i=1;i<=num;i++)
       {
           sum += i*i;
       }
       System.out.println(sum);  
   } 
}
