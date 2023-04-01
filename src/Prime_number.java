import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        int n,count=0;
        System.out.println("enter any number");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        for (int i = 1; i<=n; i++){
            if (n%i==0){
                count++;
            }
        }if (count==2){
            System.out.println("its prime number");
        }else {
            System.out.println("its not prime number");
        }
    }
}
