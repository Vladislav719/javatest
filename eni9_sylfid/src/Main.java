import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 17.09.13
 * Time: 10:56
 * Name: Bajmurzin Vladislav
 * Mail: Baimurzin.719@gmail.com
 */
public class Main {

    public static void main(String[] args) throws IOException{

        PrintWriter pw = new PrintWriter(new File("output.txt"));

        Scanner sc = new Scanner(new File("input.txt"));

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a <= 100 & b <=100 & c <= 100) {

            pw.print(a * b * c * 2);
            pw.close();
        }
    }
}
