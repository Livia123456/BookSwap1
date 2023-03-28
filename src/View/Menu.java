import java.util.Scanner;

/**
 * Main class for the UI. User only interacts with the program through terminal.
 * @author: Sebastian Zulj
 */
public class Menu {

    /**
     * Shows login/signup menu.
     * @author: Sebastian Zulj
     */
    public void signUpOrLogIn() {
        System.out.println("1. Register account.");
        System.out.println("2. Login.");
    }

    /**
     * Main menu
     * @author: Sebastian Zulj
     */
    public void showMenu() {
        System.out.println("1. Välj bok.");
        System.out.println("2. Sälj bok.");
        System.out.println("3. Sök bok.");
        System.out.println("4. Anna Book.");
        System.out.println("0. Avsluta program");
    }

    /**
     * Gets integer input from user.
     * @return: the integer that the user enters.
     * @author: Sebastian Zulj
     */
    public int getIntegerInput() {
        Scanner input = new Scanner(System.in);
        int integerInput = input.nextInt();
        input.close();
        return integerInput;
    }

    /**
     * Gets string input from user.
     * @return: the string that the user enters.
     * @author: Sebastian Zulj
     */
    public String getStringInput() {
        Scanner input = new Scanner(System.in);
        String stringInput = input.nextLine();
        input.close();
        return stringInput;
    }

}
