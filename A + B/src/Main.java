import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{

        PrintWriter pw = new PrintWriter(new File("output.txt"));
        Scanner sc = new Scanner(new File("input.txt"));
        int a = sc.nextInt(), b = sc.nextInt();
        pw.print(a + b);
        pw.close();
        
    }
}
