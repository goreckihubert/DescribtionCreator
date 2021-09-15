import java.util.Scanner;

public class Menu {
    public static void main_menu() {
        System.out.println("Main menu" +
                "\n" +
                "[1] - Pierścionek" +
                "\n" +
                "[2] - Obrączka" +
                "\n" +
                "[3] - Biżuteria" +
                "\n" +
                "[4] - Zegarki" +
                "\n" +
                "[5] - Dewocjonalia");
        Scanner take_string = new Scanner(System.in);
        int product_category;
        product_category = take_string.nextInt();
        switch (product_category) {
            case 1: {
                System.out.println("Wybrano pierścionki");
            }
            break;
            case 2: {
                System.out.println("Wybrano obrączki");
            }
            break;
            case 3: {
                System.out.println("Wybrano Biżuteria");
            }
            break;
            case 4: {
                System.out.println("Wybrano Zegarki");
                break;
            }
            case 5: {
                System.out.println("Wybrano Dewocjonalia");
                break;
            }
        }
    }
}
