import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.print("Choose action +,-,/,* (enter stop to exit): ");
        String action = in.next();

        while (!action.equals("stop")) {
            switch (action) {
                case "+":
                    System.out.print("enter first integer:  ");
                    a = in.nextInt();
                    System.out.print("enter second integer:  ");
                    b = in.nextInt();
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                case "-":
                    System.out.print("enter first integer:  ");
                    a = in.nextInt();
                    System.out.print("enter second integer:  ");
                    b = in.nextInt();
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                case "*":
                    System.out.print("enter first integer:  ");
                    a = in.nextInt();
                    System.out.print("enter second integer:  ");
                    b = in.nextInt();
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case "/":
                    System.out.print("enter first integer:  ");
                    a = in.nextInt();
                    System.out.print("enter second integer:  ");
                    b = in.nextInt();
                    if (b != 0) {
                        System.out.println(a + " / " + b + " = " + (a / b));
                    } else {
                        System.out.println("division by zero");
                    }
                    break;
                default:
                    System.out.println("Unknown action");
                    break;
            }
            System.out.print("Choose action +,-,/,* (enter stop to exit): ");
            action = in.next();
        }
        System.out.println("stop command has been entered");
    }
}