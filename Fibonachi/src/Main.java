import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 17.09.13
 * Time: 19:53
 * Name: Bajmurzin Vladislav
 * Mail: Baimurzin.719@gmail.com
 */
public class Main {

    public static void main(String[] args) {

        int n, a, b, c, i;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = 0;
        b = 1;
        for (i = 3; i <= n; i++) {

            System.out.println(a + b);
            c = b;
            b = a + b;
            a = c;
        }
    }
}
