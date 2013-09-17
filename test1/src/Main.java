import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{

        FileInputStream inputStream = new FileInputStream("data.txt");
        FileOutputStream outputStream = new FileOutputStream("result.txt");

        while (inputStream.available() > 0)  {

            int data = inputStream.read();
            outputStream.write(data);
        }
        inputStream.close();
        outputStream.close();
        System.out.println("");
    }
}