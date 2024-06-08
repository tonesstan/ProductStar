import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Hello and welcome!\n\n");
        System.out.print("Input a number of iterations: ");
        int j = in.nextInt();
        BigInteger x = BigInteger.ONE;
        for (int i = 1; i <= j; i++) {
            x = x.multiply(BigInteger.valueOf(i));
            System.out.println(i + "! = " + x);
        }
    }
}