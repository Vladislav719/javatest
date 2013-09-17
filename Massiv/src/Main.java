import java.util.Scanner;
import java.math.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, x = 1;

        n = sc.nextInt();
        double f = Math.pow(10, x);


        while (n <= f) {

            x = x + 1;
            System.out.println(x);


        }



    }
}
