package views;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import Model.Account;

public class Over {
	
	private Account account;
	private String diff;

	public JFrame frame;

	/**
	 * Create the application.
	 */
	public Over(Account account, String diff) {
		initialize(account, diff);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Account account, String diff) {
		this.account = account;
		this.diff = diff;
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 542, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnMenu = new JButton("Return to the Main Menu ");
		btnMenu.setBackground(Color.BLACK);
		btnMenu.setForeground(Color.WHITE);
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu m = new Menu(account);
				frame.dispose();
				m.frame.setVisible(true);
				
			}
		});
		btnMenu.setBounds(344, 266, 161, 32);
		frame.getContentPane().add(btnMenu);
		
		JLabel lblNewLabel = new JLabel("You Lose");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(150, 11, 229, 155);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblWannaPlayAgain = new JLabel("Wanna Play Again?");
		lblWannaPlayAgain.setVerticalAlignment(SwingConstants.TOP);
		lblWannaPlayAgain.setForeground(Color.WHITE);
		lblWannaPlayAgain.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWannaPlayAgain.setBounds(22, 181, 178, 39);
		frame.getContentPane().add(lblWannaPlayAgain);
		
		JButton btn_PlayAgain = new JButton("Play Again");
		btn_PlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (diff == "easy")
				{
					EasyLevel level;
					try {
						level = new EasyLevel(account);
						level.frame.setVisible(true);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else
				{
					HardLevel level;
					try {
						level = new HardLevel(account);
						level.frame.setVisible(true);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				frame.dispose();
					
				}
		});
		btn_PlayAgain.setForeground(Color.WHITE);
		btn_PlayAgain.setBackground(Color.BLACK);
		btn_PlayAgain.setBounds(218, 177, 161, 32);
		frame.getContentPane().add(btn_PlayAgain);
		
	}

}
