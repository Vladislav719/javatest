import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Main{

   JFrame frame1 = new JFrame();
    public static void main(String[] args) throws IOException {

        Second k = new Second();
        JInternalFrame.TITLE_PROPERTy
        frame1.setVisible(true);


        String div = "============================================================================================";
        System.out.println(div);
        System.out.println("Введите название сайта к чему будет применен пароль");
        System.out.println("Например Google");
        System.out.println(div);
        Scanner nameSite = new Scanner(System.in);
        String name = nameSite.nextLine();
        int l = name.length();
        System.out.println(l);
        File maskaFile = new File("src/maska.txt");
        FileWriter writeFile = new FileWriter(maskaFile);
        System.out.println(div);
        System.out.println("Предумайте маску для ваших паролей");
        String mask = nameSite.nextLine();
        CharSequence note = mask;
        writeFile.append(note);
        writeFile.flush();
        System.out.println(div);
        FileReader read = new FileReader("src/maska2.txt");
        BufferedReader br = new BufferedReader(read);
        String s2;
        s2 = br.readLine();
        System.out.println(s2);
        String s3 = l + s2;
        System.out.println("Ваш пароль для сайта " + name);
        System.out.println(s3);

    }
}