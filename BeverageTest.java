import java.util.Scanner;

public class BeverageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tea preparation
        System.out.print("Do you want extras with your tea (yes/no)? ");
        String teaExtras = scanner.nextLine();
        Tea tea = new Tea();
        tea.setWantsExtras(teaExtras.equalsIgnoreCase("yes"));
        tea.finalTemplateMethod();

        System.out.println();

        // Coffee preparation
        System.out.print("Do you want extras with your coffee (yes/no)? ");
        String coffeeExtras = scanner.nextLine();
        Coffee coffee = new Coffee();
        coffee.setWantsExtras(coffeeExtras.equalsIgnoreCase("yes"));
        coffee.finalTemplateMethod();

        scanner.close();
    }
}
