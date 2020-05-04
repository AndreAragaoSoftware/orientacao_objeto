package util;

public class Bank {
	
	private int accountNumber;
	private String accountName;
	private double depositValue;
	
	public Bank() {
		
	}
	
	

	public Bank(int accountNumber, String accountName, double inicialDeposit) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		// estou chamando o metodo deposit, já que na criação da conta o saldo é zero
		deposit(inicialDeposit);
	}

	public Bank(int accountNumber, String accountName) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		;

	}
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getDepositValue() {
		return depositValue;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void deposit(double amount) {
		depositValue += amount;
	} 
	
	public void withdraw(double amount) {
		depositValue -= amount + 5.0;
	}
	
	public String toString() {
		return "Account"
				+ accountNumber
				+ ", Holder: "
				+ accountName
				+ ", Balance: $ "
				+ String.format("%.2f", depositValue);
	}
	
	

}
	


	
