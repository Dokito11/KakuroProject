package views;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Over {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Over window = new Over();
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
	public Over() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
				Menu m = new Menu();
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
				EasyLevel es = new EasyLevel();
				frame.dispose();
				es.frame.setVisible(true);	
				}
		});
		btn_PlayAgain.setForeground(Color.WHITE);
		btn_PlayAgain.setBackground(Color.BLACK);
		btn_PlayAgain.setBounds(218, 177, 161, 32);
		frame.getContentPane().add(btn_PlayAgain);
		
	}

}
