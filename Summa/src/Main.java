import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        int a = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= Math.abs(a); i++) {

            s = s + i;
            

        }
		if (a<0){
			s--;
			s=-s;
		}
        pw.print(s);
        pw.close();
    }

}
