import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 17.09.13
 * Time: 10:33
 * Name: Bajmurzin Vladislav
 * Mail: Baimurzin.719@gmail.com
 */
public class Main {

    public static void main(String[] args) throws IOException{

        PrintWriter pw = new PrintWriter(new File("output.txt"));

        Scanner sc = new Scanner(new File("input.txt"));

        int a = sc.nextInt(), b= sc.nextInt();

        if (a < b) {

            pw.print("<");
            pw.close();
        }
        if (a == b) {

            pw.print("=");
            pw.close();
        }
        if (a > b) {

            pw.print(">");
            pw.close();
        }

    }
}
