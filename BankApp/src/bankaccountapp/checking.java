package bankaccountapp;

public class checking extends Account{
	//list properties specific to checkin account
	private int debitCardNo;
	private int debitCardPin;
	
	
	//constructor to intialize checkin acc propertiessvs
	public checking (String name,String SSn,double initDeposit) {
		super(name,SSn,initDeposit);
		AccNo = "2" + AccNo;
		setdebitCard();
		
	}
	@Override
	public void setRate() {
		rate = getBaseRate()*.25;
	}
	
	private void setdebitCard() {
		debitCardNo  = (int)(Math.random()*Math.pow(10, 12));
		debitCardPin = (int)(Math.random()*Math.pow(10, 4));
	}
	//list any methods specific to checkin acc
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Checkings");
		super.showInfo();
		System.out.println( "Your checking account features" +
				"\nDebit Card No: " + debitCardNo +
				"\nDebit Card Pin:"+ debitCardPin
				);
	}

}
