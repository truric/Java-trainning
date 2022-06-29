import java.util.Scanner;

public class GroceryListTest {
    public static void main(String[] args) {
        System.out.println("Grocery List");

        int userInput = 0, apples = 0, oranges = 0, grapes = 0, totalCost = 0;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                menu(userInput);
                userInput = sc.nextInt();

                switch (userInput) {
                    case 1:
                        System.out.println("Apple added to basket");
                        apples += 1;
                        totalCost += 1;
                        break;

                    case 2:
                        System.out.println("Orange added to basket");
                        oranges += 1;
                        totalCost += 2;
                        break;

                    case 3:
                        System.out.println("Grape added to basket");
                        grapes += 1;
                        totalCost += 3;
                        break;

                    case 4:
                        if (apples > 0 || oranges > 0 || grapes > 0) {
                            System.out.println("Your basket has: " + apples + " apples, " + oranges + " oranges, "
                                    + grapes + " grapes");
                            System.out.println("Your total cost at the moment: " + totalCost);
                        } else {
                            System.out.println("Your basket is empty");
                        }
                        break;

                    case 5:
                        if (totalCost != 0) {
                            System.out.println("Your total cost is: " + totalCost);
                            apples = 0;
                            oranges = 0;
                            grapes = 0;
                            totalCost = 0;
                        } else {
                            System.out.println("Nothing to charge. \nYour basket is empty");
                        }
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        break;

                    default:
                        errorMessage();
                        break;
                }
            } catch (Exception e) {
                errorMessage();
            }
        } while (userInput != 6);

    }

    private static void menu(int userInput) {
        System.out.println("1: Apples ----------- 1€");
        System.out.println("2: Oranges ---------- 2€");
        System.out.println("3: Grapes ----------- 3€");
        System.out.println("4: Check basket");
        System.out.println("5: Complete purchase");
        System.out.println("6: Exit");
    }

    private static void errorMessage() {
        System.out.println("Wrong input");
        System.out.println("Enter a number between 1 and 6");
    }
}
