import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 17.09.13
 * Time: 11:10
 * Name: Bajmurzin Vladislav
 * Mail: Baimurzin.719@gmail.com
 */
public class Main {

    public static void main(String[] args) throws IOException{

        PrintWriter pw = new PrintWriter(new File("output.txt"));

        Scanner sc = new Scanner(new File("input.txt"));

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int max;

        if ( a < b) {

            max = b;
        } else {
            max = a;
        }
        if (max < c ) {

            max = c;
        }
        int min;

        if (a < b) {

            min = a;
        }           else {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        pw.print(max - min);
        pw.close();

    }
}
