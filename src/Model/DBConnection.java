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
		ResultSet res = state.executeQuery("SELECT ID, Account_Name, Password FROM Accounts WHERE Account_Name = '" + acc.getAccountName() + "' "
				+ "AND Password = '" + acc.getAccountPassword() +"';");
		
		if(res.next())
		{
			System.out.println(res.getString("ID") + " - " + res.getString("Account_Name") + " : " + res.getString("Password")); // DELETE ME
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
			PreparedStatement prep = con.prepareStatement("INSERT INTO Accounts(Account_Name, Password) values(?,?)");
			prep.setString(1, acc.getAccountName());
			prep.setString(2, acc.getAccountPassword());
			prep.execute();
			return true;
		}
	}
	
	public static Integer getHighscore(Account acc, Integer level) throws ClassNotFoundException, SQLException
	{
		if (con == null)
		{
			getConnection();
		}
		
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT Highscore FROM Highscores WHERE Account_ID in (SELECT ID FROM Accounts WHERE Account_Name = '" + acc.getAccountName() + "')"
				+ "AND Level_ID = " + level + ";");
		if (res.next())
		{
			return res.getInt("Highscore");
		}
		return 0;
	}
	
	public static boolean setHighscore(Account acc, Integer level, Integer score) throws ClassNotFoundException, SQLException
	{
		if (con == null)
		{
			getConnection();
		}
		
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT Highscore FROM Highscores WHERE Account_ID in (SELECT ID FROM Accounts WHERE Account_Name = '" + acc.getAccountName() + "')"
				+ "AND Level_ID = " + level + " AND Highscore > " + score.toString() + ";");
		
		if (res.next())
		{
			return false;
		}
		else
		{
			PreparedStatement prep = con.prepareStatement("INSERT INTO Highscores(Account_ID, Level_ID, Highscore) values(?,?,?)");
			prep.setString(1, getAccountID(acc));
			prep.setInt(2, level);
			prep.setInt(3, score);
			prep.execute();
			return true;
		}
	}
	
	public static Integer getHighestScore(Integer level) throws ClassNotFoundException, SQLException
	{
		if (con == null)
		{
			getConnection();
		}
		
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT Highscore FROM Highscores where Level_ID = " + level + " ORDER BY Highscore DESC LIMIT 1;");
		if (res.next())
		{
			return res.getInt("Highscore");
		}
		return 0;
	}
	
	private static String getAccountID(Account acc) throws SQLException, ClassNotFoundException
	{
		if (con == null)
		{
			getConnection();
		}
		
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT ID FROM Accounts where Account_Name = '" + acc.getAccountName() + "';");
		
		return res.getString("ID");
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
				state2.execute("CREATE TABLE Accounts(ID INTEGER PRIMARY KEY AUTOINCREMENT,"
						+ "Account_Name nvarchar(25), Password nvarchar(25));");
				
				Statement state3 = con.createStatement();
				state3.execute("CREATE TABLE Highscores(ID INTEGER PRIMARY KEY AUTOINCREMENT, Account_ID integer, Level_ID integer, Highscore integer,"
						+ "foreign key(Account_ID) references Accounts(ID));");
				
			}
		}
		
	}

}
