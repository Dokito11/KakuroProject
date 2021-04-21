package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;

import classes.Account;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Help {

	private Account account;
	
	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help window = new Help(new Account("Test", "Test"));
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Help(Account account) {
		initialize(account);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Account account) {
		this.account = account;
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 712, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnHalo = new JTextPane();
		txtpnHalo.setForeground(Color.WHITE);
		txtpnHalo.setBackground(Color.BLACK);
		txtpnHalo.setEditable(false);
		txtpnHalo.setFont(new Font("Verdana", Font.ITALIC, 14));
		txtpnHalo.setText(":> Kakuro puzzles are similar with crosswords, but instead of letters the board is filled with digits (from 1 to 9).");
		txtpnHalo.setBounds(429, 81, 226, 87);
		frame.getContentPane().add(txtpnHalo);
		
		JTextPane txtpnTheBoards = new JTextPane();
		txtpnTheBoards.setBackground(Color.BLACK);
		txtpnTheBoards.setForeground(Color.WHITE);
		txtpnTheBoards.setEditable(false);
		txtpnTheBoards.setFont(new Font("Verdana", Font.ITALIC, 14));
		txtpnTheBoards.setText(":> The board's squares need to be filled in with these digits in order to sum up to the specified numbers.");
		txtpnTheBoards.setBounds(429, 165, 226, 87);
		frame.getContentPane().add(txtpnTheBoards);
		
		JTextPane txtpnHalo_1_1 = new JTextPane();
		txtpnHalo_1_1.setBackground(Color.BLACK);
		txtpnHalo_1_1.setForeground(Color.WHITE);
		txtpnHalo_1_1.setEditable(false);
		txtpnHalo_1_1.setFont(new Font("Verdana", Font.ITALIC, 14));
		txtpnHalo_1_1.setText(":> You are not allowed to use the same digit more than once to obtain a given sum.");
		txtpnHalo_1_1.setBounds(429, 249, 226, 73);
		frame.getContentPane().add(txtpnHalo_1_1);
		
		JTextPane txtpnHalo_1_1_1 = new JTextPane();
		txtpnHalo_1_1_1.setBackground(Color.BLACK);
		txtpnHalo_1_1_1.setForeground(Color.WHITE);
		txtpnHalo_1_1_1.setEditable(false);
		txtpnHalo_1_1_1.setFont(new Font("Verdana", Font.ITALIC, 14));
		txtpnHalo_1_1_1.setText(":> Good luck!");
		txtpnHalo_1_1_1.setBounds(429, 320, 226, 73);
		frame.getContentPane().add(txtpnHalo_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Need Help?");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(307, 11, 101, 24);
		frame.getContentPane().add(lblNewLabel);
		String url = "4x4.JPG";
		ImageIcon ic = new ImageIcon(url);
		
		JLabel lblNewLabel_1 = new JLabel(ic);
		lblNewLabel_1.setBounds(59, 81, 262, 258);
		ImageIcon icon = new ImageIcon(
	              Help.class.getResource("/images/4x4.JPG"));
		lblNewLabel_1.setIcon(icon);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Return To Main Menu");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		btnNewButton.setBounds(485, 415, 170, 36);
		frame.getContentPane().add(btnNewButton);
	}
}
