package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Model.Account;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Winnner {

	private Account account;
	
	public JFrame frame;

	/**
	 * Create the application.
	 */
	public Winnner(Account account) {
		initialize(account);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Account account) {
		this.account = account;
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Congratulation You Win!!");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(47, 42, 330, 153);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnMenu = new JButton("Return to the Main Menu");
		btnMenu.setBackground(Color.BLACK);
		btnMenu.setForeground(Color.WHITE);
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu m = new Menu(account);
				frame.dispose();
				m.frame.setVisible(true);
			}
		});
		btnMenu.setBounds(127, 212, 187, 38);
		frame.getContentPane().add(btnMenu);
	}

}
