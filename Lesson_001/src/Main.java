import java.math.BigInteger;
import java.util.Scanner;
import java.util.Random;

public class Main{

    public static void main(String[] args) {

        String div = "################################################";
        System.out.println(div);
        System.out.println("Vvod dannix");
        Scanner sc = new Scanner(System.in);
        System.out.println(div);
        int digit;
        digit = sc.nextInt();
        System.out.println("vvedite ot 0 do 3");
        Random rd = new Random();
        int b = rd.nextInt(BigInteger);
        if (digit == b ) {

            System.out.println(div);
            System.out.println("Not bad");
            System.out.println(div);

        }   else {
            System.out.println(div);
            System.out.println("loos");
            System.out.println(div);
        }
        System.out.println("число было");
        System.out.println(digit);
        System.out.println(div);
        BigInteger f=BigInteger.valueOf(111233).pow(100);
        BigInteger g = BigInteger.valueOf(20);

        BigInteger c = f.add(g);
        System.out.println(c);
        System.out.println(div);                     }
}