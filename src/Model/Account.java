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
	
	public Boolean Login(HashMap<String,String> accList)
	{
		if (accList.containsKey(this.accountName) && accList.get(this.accountName).equals(this.accountPass))
		{
			return true;
		}
		return false;
	}
	
	public Boolean CreateAccount(HashMap<String,String> accList)
	{
		if (accList.containsKey(this.accountName))
		{
			return false;
		}
		accList.put(this.accountName, this.accountPass);
		return true;
	}
	
}
