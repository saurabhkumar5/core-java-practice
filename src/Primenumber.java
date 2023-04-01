import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        int n,m,i,j;
        System.out.println("enter any two numbers");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        m = r.nextInt();
        for ( i = n; i<=m; i++){
           for (j = 2; j<=i; j++){
               if (i%j==0)
                   break;

               }
            if (i==j)
                System.out.print(j+" ");

        }
    }
}
