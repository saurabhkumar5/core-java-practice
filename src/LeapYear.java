import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int n;
        System.out.println("enter any year");
        Scanner r = new Scanner(System.in);
        n =r.nextInt();
        if (n%100==0 && n%400==0 || n%100!=0 && n%4==0){
            System.out.println("Leap Year");
        }else {
            System.out.println("not leap year");
        }
    }
}
