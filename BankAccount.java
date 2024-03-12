package codesoft;
import java.util.*;

public class BankAccount {
	private double balance;
	
	public BankAccount(double initial) {
		this.balance = initial;
		}
	
	public double getbalance() {
		return balance;
	}
	
	public void deposite(double amount) {
		if(amount>0) {
			balance+= amount;
			System.out.println("Deposited successfully.");
			System.out.println(" Balance: "+balance);
		}
		else {
			System.out.println("Invalid Amount to Deposite");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance -=amount;
			System.out.println("Withdrawal Successful.");
			System.out.println(" Balance: "+balance);
		}
		else {
			System.out.println("Insufficient Balance to Withdraw. ");
		}
	}
}
class ATM{
	private BankAccount account;
	private Scanner sc;
	
	public ATM(BankAccount account) {
		this.account = account;
		this.sc = new Scanner(System.in);
	}
	
	public void showMenu() {
		System.out.println();
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		System.out.println();
	}
	
	public void run() {
		int choice;
		do {
			showMenu();
			System.out.print("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				checkbalance();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				System.out.println("Thank You for Visiting");
				break;
			default:
				System.out.println("Invalid Choice. Please select the valid Option");
				}
			}while(choice!=4);
	}
	
	private void checkbalance() {
		System.out.println("Your current Balance is: "+account.getbalance());
	}
	
	private void deposit() {
		System.out.println("Enter the amount to deposit: ");
		double amount=sc.nextDouble();
		account.deposite(amount);
	}
	
	private void withdraw() {
		System.out.println("Enter the amount to Withdraw from the account: ");
		double amount=sc.nextDouble();
		account.withdraw(amount);
	}
}

class AtmInterface{
	public static void main(String[] args) {
		System.out.println("--------WELCOME TO THE ATM-------");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your 4 digit pin: ");
		int pin= obj.nextInt();
		
		BankAccount useraccount = new BankAccount(10000.0);
		ATM atm =new ATM(useraccount);
		atm.run();
	}
}