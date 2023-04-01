import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("enter any number");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        for (int i = 1; i<n; i++){
            if (n%i==0){
                sum = sum+i;
            }
        }if (sum==n){
            System.out.println("its perfect number");
        }else {
            System.out.println("not perfect number");
        }
    }
}
