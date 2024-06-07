import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Hello and welcome!\n\n");
        System.out.print("Input a number of iterations: ");
        int j = in.nextInt();
        int x  = 1;
        for (int i = 1; i <= j; i++) {
            x = x*i;
            System.out.println(i + "! = " + x);
        }
    }
}