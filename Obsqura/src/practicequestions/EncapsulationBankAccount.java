package practicequestions;

/*Write a Java program to create a class called BankAccount with private 
 * instance variables accountNumber and balance. Provide public getter and 
 * setter methods to access and modify these variables.*/

public class EncapsulationBankAccount {
	private String accountNumber;
	private double balance;
	
	public void setter(String accountNumber,double balance) {
		this.accountNumber=accountNumber;
		this.balance = balance;
	}
	
	public void getter() {
		System.out.println("The account number is "+ accountNumber);
		System.out.println("Account balance is "+balance);
	}

}
