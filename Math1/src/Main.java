import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public JFrame frame;

    public static void main(String[] args) {
        /*
            ###############################################
            #             Объявляем переменные            #
            ###############################################
         */
        final int WIDTH = 450;
        final int HEIGHT = 500;
        String TITLE = "MATRIX";
        /*
            ###############################
            # Создание окна и настройка   #
            ###############################
         */

        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(TITLE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.getContentPane();
        /*
               #############################
               # Создаем панельку          #
               #############################

         */
        int name = 0;
        try {
            name = new Scanner(System.in).nextInt();
        } catch (Exception e) {

        }
        JPanel panel = new JPanel();
             //настройка панели
        //panel.setBackground(Color);
        panel.setBorder(BorderFactory.createTitledBorder("Полученные данные"));
        panel.add(new JLabel("      "   + name +   "       "));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
