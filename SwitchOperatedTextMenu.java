
import java.util.Scanner;

public class SwitchOperatedTextMenu {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int menuItem;
        boolean quit = false;

        do {
            // Print menu
            for (int i = 1; i <= 2; i++) {
                System.out.println(i + ". Menu item #" + i);
            }

            System.out.println("0. Quit");

            // Handle user commands
            System.out.print("Choose menu item: ");
            menuItem = in.nextInt();

            switch (menuItem) {
                case 1:
                    System.out.println("You've chosen item #1");
                    // do something...
                    break;

                case 2:
                    System.out.println("You've chosen item #2");
                    // do something...
                    break;

                case 0:
                    quit = true;
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        } while (!quit);

        System.out.println("Bye-bye!");

        in.close();
    }
}
