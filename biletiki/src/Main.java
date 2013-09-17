/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 16.09.13
 * Time: 12:09
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {

        int colvo = 0;
        int r = 0 , l = 0;

        for (int i = 0; i <= 999999; i++) {

            r = i % 1000;
            l = i / 1000;
            int r1 = (r % 10) + (r / 10 % 10) + (r / 100 );
            int l1 = (l % 10) + (l / 10 % 10) + (l / 100);
            if (r1 == l1) {

                colvo = colvo + 1;
            }

        }
        System.out.println(colvo);

    }
}
