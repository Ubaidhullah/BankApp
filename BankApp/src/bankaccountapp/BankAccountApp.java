package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {



	public static void main(String[] args) {
		String file= "/home/ubaidhullah/eclipse-workspace/BankApp/NewBankAccounts.csv";
		List<Account> accounts = new LinkedList<Account>();
		
		/*checking checkacc1 = new checking ("jack morris","956874123",1500);
		
		savings savinacc1 = new savings ("rude jack", "954683216",2500);
		
		checkacc1.showInfo();
		System.out.println("------------------------------------");
		savinacc1.showInfo();
*/
		
		List<String[]> newAccountHolder = Utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolder) {
			String name = accountHolder[0];
			String SSn = accountHolder[1];
			String AccountType = accountHolder[2];
			double inItDeposit = Double.parseDouble(accountHolder[3]);
			if (AccountType.equals("Savings")) {
				accounts.add(new savings(name, SSn , inItDeposit));
			}
			else if (AccountType.equals("Checking")) {
				accounts.add(new checking(name, SSn , inItDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
			for (Account acc : accounts) {
				System.out.println("\n***********************");
				acc.showInfo();
			}

		}
	}

}
