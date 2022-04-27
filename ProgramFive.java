import java.util.Scanner;

public class ProgramFive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();
        int sum = 0;
        for(int i = 1;i<=num;i++)
        {
            sum += (int)Math.pow(i, i);
        }
        System.out.println(sum);

    }
    
}
