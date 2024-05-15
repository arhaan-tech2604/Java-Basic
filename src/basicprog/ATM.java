package basicprog;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		int Balance=1000000,Withdraw,Deposit;
		
		Scanner scanner=new Scanner(System.in);
		
	    while (true) {
			System.out.println("ATM(Automatic Teller MAchine)");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for Exit");
			System.out.println("Choose As per You reqiurement : ");
			
			int choice=scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter Withdrawal Ammount : ");
				Withdraw=scanner.nextInt();
				
				if (Balance >= Withdraw) {
					Balance=Balance-Withdraw;
					System.out.println("Please Collect your Amount");
					System.out.println("Thank you.....!!");
				}
				else {
					System.out.println("Insufficient Balance");
					System.out.println("Thank you.....!!");
				}
				System.out.println("");
				break;

			case 2:
				System.out.println("Enter Deposit Amount : ");
			    Deposit=scanner.nextInt();
			    
			    Balance=Balance+Deposit; 
			    System.out.println("Your Amount is deposit Successfully in your Account");
			    System.out.println("Thank you.....!!");
			    System.out.println("");
			    break;
			 
			case 3:
				System.out.println("Total Balnced In your Account : "+Balance);
				System.out.println("");
				break;
				
			case 4:	
				System.out.println("Dhanyawad...!!");
				System.out.println("");
				break;
			}
		}
	}
}
