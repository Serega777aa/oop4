import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(
                "1- добавить работника\n" +
                "2 - поменять отдел\n" +
                "3 - показать отдел\n" +
                "0 - выход\n");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        Menu p = new Menu();
        while (true) {

            switch (choice) {
                case 1:
                    p.AddPersona();
                    break;
                case 2:
                    p.UppdateDep();
                    break;
                case 0:
                    break;
            }
        }
    }
}