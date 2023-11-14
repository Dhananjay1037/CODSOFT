package dhanu.atm;

import java.util.Scanner;

public class MainApp {

	
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Initialize bank account with a balance of 1000
	        BankAccount bankAccount = new BankAccount(1000);

	        // Initialize ATM with the bank account
	        ATM atm = new ATM(bankAccount);

	        while (true) {
	            atm.displayMenu();
	            System.out.print("Choose an option (1-4): ");
	            int option = scanner.nextInt();

	            atm.processOption(option, scanner);
	        }
	    }
	}


