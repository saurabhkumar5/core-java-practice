import java.util.Scanner;

public class Square_root {
    public static void main(String[] args) {
        int n;
        System.out.println("enter any number");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
      double m = Math.sqrt(n);
        System.out.println("square root of "+n+ " = "+m);
    }
}
