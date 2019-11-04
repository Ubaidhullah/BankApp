package bankaccountapp;

public class savings extends Account{
	//list properties specific to savin acc
	private int SafetyDepositBoxId;
	private int SafetyDepositBoxKey;
	
	//contructor to intitialize 
	public savings (String name,String SSn,double initDeposit) {
		super(name,SSn,initDeposit);
		AccNo = "1" + AccNo;
		setSafetyDepositBox();
		
	}
	@Override
	public void setRate() {
		rate = getBaseRate()*.15;
	}
	
	private void setSafetyDepositBox() {
		SafetyDepositBoxId = (int)(Math.random()*Math.pow(10, 3));
		SafetyDepositBoxKey = (int)(Math.random()*Math.pow(10, 4));
	}

	
	//list any methods specific to savvin acc
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Savings");
		super.showInfo();
		System.out.println( "Your Savvings Account Feautures"+
				"\nSafety Deposit box ID: " + SafetyDepositBoxId +
				"\nSafety Deposit Box Key:"+ SafetyDepositBoxKey
				);
				
	}
}
