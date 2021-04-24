package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	private static Connection con;
	private static boolean hasData = false;
	
	
	public static boolean login(Account acc) throws ClassNotFoundException, SQLException
	{
		if (con == null)
		{
			getConnection();
		}
		
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT Account_Name, Password FROM Accounts WHERE Account_Name = '" + acc.getAccountName() + "' "
				+ "AND Password = '" + acc.getAccountPassword() +"';");
		
		if(res.next())
		{
			return true;
		}
		return false;
	}
	
	public static boolean createAccount(Account acc) throws ClassNotFoundException, SQLException
	{
		if (con == null)
		{
			getConnection();
		}
		
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT Account_Name FROM Accounts WHERE Account_Name = '" + acc.getAccountName() + "';");
		
		if (res.next())
		{
			return false;
		}
		else
		{
			PreparedStatement prep = con.prepareStatement("INSERT INTO Accounts values(?,?,?)");
			prep.setString(2, acc.getAccountName());
			prep.setString(3, acc.getAccountPassword());
			prep.execute();
			return true;
		}
	}
	
	public static void getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("org.sqlite.JDBC");
		con = DriverManager.getConnection("jdbc:sqlite:Kakuro.db");
		initialize();
	}

	private static void initialize() throws SQLException {
		if (!hasData)
		{
			hasData = true;
			
			Statement state = con.createStatement();
			ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type = 'table' and name = 'Accounts'");
			if (!res.next())
			{
				System.out.println("Building the Account Table");
				
				Statement state2 = con.createStatement();
				state2.execute("CREATE TABLE Accounts(Account_ID integer,"
						+ "Account_Name nvarchar(25), Password nvarchar(25),"
						+ "primary key(Account_ID));");
				
				Statement state3 = con.createStatement();
				state3.execute("CREATE TABLE Levels(Level_ID integer, Level_Difficulty integer, " +
						"Label_1 integer, Label_2 integer, Label_3 integer, Label_4 integer, " +
						"Label_5 integer, Label_6 integer, Grid_1 integer, Grid_2 integer, " +
						"Grid_3 integer, Grid_4 integer, Grid_5 integer, Grid_6 integer, " +
						"Grid_7 integer, Grid_8 integer, Grid_9 integer, primary key(Level_ID));");
				
				Statement state4 = con.createStatement();
				state4.execute("CREATE TABLE Highscores(ID integer, Account_ID integer, Level_ID integer, Highscore integer,"
						+ "primary key(ID), foreign key(Account_ID) references Accounts(Account_ID),"
						+ "foreign key(Level_ID) references Levels(Level_ID));");
				
			}
		}
		
	}

}
