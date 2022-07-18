import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weights: ");
        int gift = in.nextInt();
        int apple = in.nextInt();
        int orange = in.nextInt();
        int pear = in.nextInt();
        int applenum = gift / apple;
        int orangenum = gift / orange;
        int sum, sum1, sum2, sum3 = 0;

        for (int i = 0; i <= applenum; i++) {
            for (int j = 0; j <= orangenum; j++) {
                sum = apple * i;
                sum1 = orange * j;
                sum2 = (gift - sum - sum1) / pear;
                if (sum2 >= 0) {
                    if (sum2 * pear + sum1 + sum == gift) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}