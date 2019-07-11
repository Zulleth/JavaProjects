package bankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		String file = "./src/utilities/NewBankAccounts.csv";
		
		
		// Read a CSV file then create new accounts based on that data
		List<String[]> newAccountHolder = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolder) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			if( accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if(accountType.equals("Checking")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if(accountType.equals("Checking")) {
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
	

		}
//		accounts.get(5).showInfo();
		for (Account acc: accounts) {
			System.out.println("\n*******************");
			acc.showInfo();
		}
	}

}
