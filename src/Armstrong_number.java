import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        int n,c,r, arm=0;
        System.out.println("enter any number");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        c=n;
        while (n>0){
            r = n%10;
            arm = (r*r*r)+arm;
            n = n/10;
        }if (arm==c){
            System.out.println("its armstrong number");
        }else {
            System.out.println("its not armstrong number");
        }
    }
}
