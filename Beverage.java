import java.util.Scanner;

public class Beverage {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        int beverage;

        System.out.println("[1] Coke");
        System.out.println("[2] Sprite");
        System.out.println("[3] Royal");
        System.out.println("[4] Rootbeer");
        System.out.println("[5] Pepsi");

        System.out.print("Enter code (1-5): ");
        beverage = object.nextInt();

        /*
         * Selecting a beverage using If else statement
         * if (beverage == 1) {
         * System.out.println("Beverage is Coke");
         * } else if (beverage == 2) {
         * System.out.println("Beverage is Sprite");
         * } else if (beverage == 3) {
         * System.out.println("Beverage is Royal");
         * } else if (beverage == 4) {
         * System.out.println("Beverage is Rootbeer");
         * } else if (beverage == 5) {
         * System.out.println("Beverage is Pepsi");
         * } else {
         * System.out.println("Invalid Input");
         * }
         */

        // 2ND PROGRAM USING SWITCH STATEMENT
        switch (beverage) {
            case 1:
                System.out.println("Beverage is Coke");
                break;
            case 2:
                System.out.println("Beverage is Sprite");
                break;
            case 3:
                System.out.println("Beverage is Royal");
                break;
            case 4:
                System.out.println("Beverage is Rootbeer");
                break;
            case 5:
                System.out.println("Beverage is Pepsi");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        object.close();
    }
}
