package Model;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Account {

	private String accountName;
	private String accountPass;
	
	public String getAccountName() {return accountName;}
	public String getAccountPassword() {return accountPass;}
	
	public Account(String accName, String accPassword)
	{
		this.accountName = accName;
		this.accountPass = accPassword;
	}
}
