import java.util.Scanner;

public class ProgramThree
 {
     public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
         System.out.println("Enter a number:");
         int num= s.nextInt();
         s.close();
         for(int i=0;i<=num;i++)
         {
             int v = i%26;
             //System.out.println(v);
             System.out.print((char)(v+65)+" "+(i+1)+' ');
         }
     }


    
}
