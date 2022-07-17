import java.util.Scanner;

public class lucky {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, ticket, s1=0, s2=0;
        System.out.print("Enter six-digit number: ");
        ticket = in.nextInt();
        for(i = 0; i < 3; i++)
        {
            s1 += ticket%10;
            ticket /= 10;
        }
        for(i = 0; i < 3; i++)
        {
            s2 += ticket%10;
            ticket /= 10;
        }
        if(s1 == s2)
            System.out.println("Lucky");
        else
            System.out.println("Unlucky");

    }
}