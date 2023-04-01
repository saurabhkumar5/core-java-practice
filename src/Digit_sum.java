import java.util.Scanner;

public class Digit_sum {
    public static void main(String[] args) {
        int n,r,sum=0;
        System.out.println("enter any numbers");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        while (n>0){
            r = n%10;
            sum = sum+r;
            n = n/10;
        }
        System.out.println("sum of digits = "+sum);
    }
}
