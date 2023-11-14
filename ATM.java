package dhanu.atm;

import java.util.Scanner;

public class ATM {
	
	private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void displayMenu() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void processOption(int option, Scanner scanner) {
        switch (option) {
            case 1:
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = scanner.nextDouble();
                if (withdrawAmount > 0) {
                    bankAccount.withdraw(withdrawAmount);
                } else {
                    System.out.println("Invalid amount for withdrawal.");
                }
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                if (depositAmount > 0) {
                    bankAccount.deposit(depositAmount);
                    System.out.println("Deposit successful. New balance: " + bankAccount.getBalance());
                } else {
                    System.out.println("Invalid amount for deposit.");
                }
                break;
            case 3:
                System.out.println("Current Balance: " + bankAccount.getBalance());
                break;
            case 4:
                System.out.println("Exiting. Thank you!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
}



