import java.util.*;
import java.io.*;
public class AplusB {

    public static void main(String[] args) throws IOException{

        PrintWriter pw = new PrintWriter(new File("src/output.txt"));
        Scanner sc = new Scanner(new File("src/input.txt"));
        int a = sc.nextInt(), b = sc.nextInt();
        pw.print(a + b);
        pw.close();
        return ;
    }
}
