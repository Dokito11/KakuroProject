package views;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import Model.Account;
import Model.Game;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.util.Random;


public class EasyLevel {

	private Account account;
	
	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application (Testing Purposes).
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EasyLevel window = new EasyLevel(new Account("Test", "Test"));
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					int s = 5;
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EasyLevel(Account account) {
		initialize(account);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Account account) {
		
		String[][] levelNumbers = {
				{"16","8","16","8"},
				{"14","3","11","6"},
				{"17","8","13","12"},
				{"12","3","8","7"},
				{"12","4","11","5"},
				{"8","3","7","4"},
				{"16","5","12","9"},
				{"14","8","12","10"},
				{"15","3","11","7"},
		};
		
		int[][] levelSolutions = {
				{9,7,7,1},
				{9,5,2,1},
				{8,9,5,3},
				{7,5,1,2},
				{8,4,3,1},
				{5,3,2,1},
				{9,7,3,2},
				{5,9,7,1},
				{9,6,2,1},
		};
		
		Random rand = new Random();
		int int_rand = rand.nextInt(9);
		
		this.account = account;
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 416, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		Game.InitTextfield(frame, textField, 178, 109, 52, 46);
		textField_1 = new JTextField();
		Game.InitTextfield(frame, textField_1, 230, 109, 52, 46);
		textField_2 = new JTextField();
		Game.InitTextfield(frame, textField_2, 178, 156, 52, 46);
		textField_3 = new JTextField();
		Game.InitTextfield(frame, textField_3, 230, 156, 52, 46);
		
		JLabel lblNewLabel = new JLabel(levelNumbers[int_rand][0]);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(150, 109, 28, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(levelNumbers[int_rand][1]);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(150, 156, 28, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(levelNumbers[int_rand][2]);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(185, 81, 45, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel(levelNumbers[int_rand][3]);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(234, 77, 34, 34);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JButton btnDone = new JButton("Done");
		btnDone.setBackground(new Color(0, 0, 0));
		btnDone.setForeground(Color.WHITE);
		btnDone.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().trim().isEmpty()||textField_1.getText().trim().isEmpty() ||textField_2.getText().trim().isEmpty()||textField_3.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null,"You have to fill data in all of the boxes","Alert",JOptionPane.INFORMATION_MESSAGE);
				}
				else {
				int[] arr = {Integer.parseInt( textField.getText()),Integer.parseInt( textField_1.getText()),Integer.parseInt( textField_2.getText()),
						Integer.parseInt( textField_3.getText())};
				
				
				int[] result = levelSolutions[int_rand];
				for(int i = 0 ; i<arr.length ; i++)
				{
					if(arr[i] != result[i])
					{
						Over o = new Over(account, "easy");
						o.frame.setVisible(true);
						frame.setVisible(false);
						break;
		
					}
					else if (i == arr.length - 1 && arr[i] == result[i]) {
						Winnner w = new Winnner(account);
						w.frame.setVisible(true);
						frame.setVisible(false);
						break;
					}
					
					
				}
			
			}
			}
		});
		btnDone.setBounds(183, 233, 85, 34);
		frame.getContentPane().add(btnDone);
		
		JButton btn_Help = new JButton("Need help?");
		btn_Help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Help h = new Help(account);
			h.frame.setVisible(true);
			}
		});
		btn_Help.setForeground(Color.WHITE);
		btn_Help.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_Help.setBackground(Color.BLACK);
		btn_Help.setBounds(250, 300, 119, 34);
		frame.getContentPane().add(btn_Help);
		
		JLabel lbl_Title = new JLabel("K");
		lbl_Title.setForeground(Color.WHITE);
		lbl_Title.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lbl_Title.setBounds(29, 55, 28, 34);
		frame.getContentPane().add(lbl_Title);
		
		JLabel lbl_Title_1 = new JLabel("A");
		lbl_Title_1.setForeground(Color.WHITE);
		lbl_Title_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lbl_Title_1.setBounds(29, 100, 28, 34);
		frame.getContentPane().add(lbl_Title_1);
		
		JLabel lbl_Title_1_1 = new JLabel("K");
		lbl_Title_1_1.setForeground(Color.WHITE);
		lbl_Title_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lbl_Title_1_1.setBounds(29, 148, 28, 34);
		frame.getContentPane().add(lbl_Title_1_1);
		
		JLabel lbl_Title_1_1_1 = new JLabel("U");
		lbl_Title_1_1_1.setForeground(Color.WHITE);
		lbl_Title_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lbl_Title_1_1_1.setBounds(29, 192, 28, 34);
		frame.getContentPane().add(lbl_Title_1_1_1);
		
		JLabel lbl_Title_1_1_1_1 = new JLabel("R");
		lbl_Title_1_1_1_1.setForeground(Color.WHITE);
		lbl_Title_1_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lbl_Title_1_1_1_1.setBounds(29, 238, 28, 34);
		frame.getContentPane().add(lbl_Title_1_1_1_1);
		
		JLabel lbl_Title_1_1_1_1_1 = new JLabel("O");
		lbl_Title_1_1_1_1_1.setForeground(Color.WHITE);
		lbl_Title_1_1_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lbl_Title_1_1_1_1_1.setBounds(29, 283, 28, 34);
		frame.getContentPane().add(lbl_Title_1_1_1_1_1);
		
		JLabel lbl_Title_1_1_1_1_2 = new JLabel("EASY LEVEL");
		lbl_Title_1_1_1_1_2.setForeground(Color.WHITE);
		lbl_Title_1_1_1_1_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lbl_Title_1_1_1_1_2.setBounds(155, 11, 99, 34);
		frame.getContentPane().add(lbl_Title_1_1_1_1_2);
	}
}
