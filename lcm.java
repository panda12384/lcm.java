import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int a=num1;
        int b= num2;
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        int gcd=a;
        int lcm=(num1*num2)/gcd;
        System.out.println(lcm);
    }
}
