package testingpackage;

import itempackage.item;
import transactionpackage.transaction;
import userpackage.user;

import javax.xml.validation.Validator;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user ID: ");
        String userId = scanner.nextLine();
        System.out.println("Enter user name: ");
        String userName = scanner.nextLine();

        if (Validator.validateString(userId) && Validator.validateString(userName)) {
            user user = new user(userId, userName);
            System.out.println("User created: " + user);
        } else {
            System.out.println("Invalid user data.");
        }

        System.out.println("Enter item ID: ");
        String itemId = scanner.nextLine();
        System.out.println("Enter item name: ");
        String itemName = scanner.nextLine();

        if (Validator.validateString(itemId) && Validator.validateString(itemName)) {
            item item = new item(itemId, itemName);
            System.out.println("Item created: " + item);
        } else {
            System.out.println("Invalid item data.");
        }
        transaction transaction = new transaction("T001", new user(userId, userName), new item(itemId, itemName));
        System.out.println("Transaction created: " + transaction);
        scanner.close();
    }
}
