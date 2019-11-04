package bankaccountapp;

public abstract class Account implements IBaseRate {
	//list common properties for savin and checkin
	private String name;
	private String SSn;
	private double balance;
	
	private static int index = 10000;
	protected String AccNo;
	protected double rate;
	
	//constructor to set base properties and intialize acc
	public Account (String name,String SSn,double inItDeposit) {
		this.name = name;
		this.SSn = SSn;
		balance = inItDeposit;
		
		
		//set account number
		index++;
		this.AccNo = SetAccNo();
		setRate();
	}
	//list common methods
	public abstract void setRate();

	
	private String SetAccNo() {
		String lastTwoOfSSn = SSn.substring(SSn.length()-2,SSn.length());
		int uniqueId = index;
		int randomnumber =(int)(Math.random()*Math.pow(10, 3));
		return lastTwoOfSSn + uniqueId + randomnumber; 
	}
	
	
	//transaction methods
	public void Deposit(double amount) {
		balance = balance+ amount;
		System.out.println("Depositing amount $"+amount);
		PrintBalance();
	}
	public void WithDraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing Amount $"+amount);
		PrintBalance();
	}
	public void Transfer(String ToWhere, double amount) {
		balance = balance - amount;
		System.out.println("Tranfering $"+amount+"To:"+ToWhere);
		PrintBalance();
	}
	public void PrintBalance() {
		System.out.println("your balance is now: $"+ balance);
	}
	
	public void showInfo() {
		System.out.println(
				"Name:" + name +
				"\nAccount Number:" + AccNo +
				"\nBalance: " + balance +
				"\nRate:"+rate+"%"
				
				);
	}
	

}
