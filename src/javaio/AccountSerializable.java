package javaio;

import java.io.Serializable;

public class AccountSerializable implements Serializable{

	private int account;
	private String firstName;
	private String lastName;
	private double balance;
	public AccountSerializable()
	{
		this(0,"","",0.0);
	}
	public AccountSerializable(int acco,String fn,String ln,double bal)
	{
		setAccount(acco);
		setFirstName(fn);
		setLastName(ln);
		setBalance(bal);
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
