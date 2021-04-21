package views;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Menu {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 413, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEasy = new JButton("Easy");
		btnEasy.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnEasy.setForeground(Color.WHITE);
		btnEasy.setBackground(Color.BLACK);
		btnEasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EasyLevel es = new EasyLevel();
				Menu m = new Menu();
				frame.dispose();
				es.frame.setVisible(true);
			}
		});
		btnEasy.setBounds(24, 209, 133, 59);
		frame.getContentPane().add(btnEasy);
		
		JButton btnHard = new JButton("Hard");
		btnHard.setBackground(Color.BLACK);
		btnHard.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnHard.setForeground(Color.WHITE);
		btnHard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HardLevel hd = new HardLevel();
				frame.dispose();
				hd.frame.setVisible(true);
			}
		});
		btnHard.setBounds(209, 209, 133, 59);
		frame.getContentPane().add(btnHard);
		
		JLabel lblNewLabel = new JLabel("KAKURO");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.ITALIC, 68));
		lblNewLabel.setBounds(71, 21, 260, 76);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SELECT DIFFICULTY");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(94, 108, 200, 28);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
