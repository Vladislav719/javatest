import java.util.Scanner;
import java.math.*;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 15.09.13
 * Time: 15:04
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double f, x = 1;
        int n = sc.nextInt();
        f = Math.pow(10, x);
        double s;

        do {

            s = x + 1;
        } while (n <= f);
        sc.close();

        System.out.println(s);


    }
}
