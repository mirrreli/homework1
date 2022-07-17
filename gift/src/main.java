import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int count = 0;
        int i,j,k;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weights: ");
        int gift = in.nextInt();
        int apple = in.nextInt();
        int orange = in.nextInt();
        int pear = in.nextInt();

        int[] arr1 = {apple, orange, pear};
        for(int n = arr1.length-1 ; n > 0 ; n--) {
            for (int m = 0; m < n; m++) {
                if (arr1[m] > arr1[m + 1]) {
                    int tmp = arr1[m];
                    arr1[m] = arr1[m + 1];
                    arr1[m + 1] = tmp;
                }
            }
        }
        int maxnum = gift/arr1[0];
        int middlenum = gift/arr1[1];
        int minnum = gift/arr1[2];

        for(i = 0;  i <= maxnum; i++){
            for(j = 0;  j <= middlenum; j++){
                for(k = 0;  k <= minnum; k++){
                    if(gift == (i*arr1[0] + j*arr1[1] + k*arr1[2])){
                        count+=1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}