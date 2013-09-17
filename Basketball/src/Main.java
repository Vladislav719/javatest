import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 17.09.13
 * Time: 11:58
 * Name: Bajmurzin Vladislav
 * Mail: Baimurzin.719@gmail.com
 */
public class Main {

    public static void main(String[] args) throws IOException{

        PrintWriter pw = new PrintWriter(new File("output.txt"));

        Scanner sc = new Scanner(new File("input.txt"));



       Byte a1 = sc.nextByte(), b1 = sc.nextByte(), a2 =sc.nextByte(), b2 = sc.nextByte(), a3 = sc.nextByte(), b3 = sc.nextByte(),
        a4 = sc.nextByte(), b4 = sc.nextByte();

        int a = a1 + a2 + a3 + a4,
        b = b1 + b2 + b3 + b4;

        if (a < b) {

            pw.print(2);
            pw.close();
        }
        if (a > b) {

            pw.print(1);
            pw.close();
        }
        if (a == b) {

            pw.print("DRAW");
            pw.close();
        }



    }
}
