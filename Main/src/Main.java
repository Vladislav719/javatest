import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        String name, sName;
        int age, group;

        Scanner sc = new Scanner(System.in);

        name = sc.nextLine();
        sName = sc.nextLine();

        age = sc.nextInt();
        group = sc.nextInt();

        System.out.println("Имя " + name + " фамилия " + sName + " Возраст: " + age + " Группа: " + group);
        System.out.println();
        System.out.println();
        System.out.println();
        sc.close();

    }
}
