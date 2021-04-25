package views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Model.Account;
import Model.DBConnection;
import Model.Game;
import Model.Validate;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class HardLevel {

	private Account account;
	
	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JButton btn_Help;
	private JLabel lbl_Title;
	private JLabel lbl_Title_1;
	private JLabel lbl_Title_1_1;
	private JLabel lbl_Title_1_1_1;
	private JLabel lbl_Title_1_1_1_1;
	private JLabel lbl_Title_1_1_1_1_1;
	private JLabel lbl_Title_1_1_1_2;
	private JLabel lbl_Score;

	private Integer score = 800;
	
	public HardLevel(Account account) throws ClassNotFoundException, SQLException {
		initialize(account);
	}

	void initialize(Account account) throws ClassNotFoundException, SQLException {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				score--;
				lbl_Score.setText("Score: " + score);
			}
		};
		
		timer.scheduleAtFixedRate(task, 1000, 1000);
		
		this.account = account;
		
		String[][] levelNumbers = {
				{"22","21","7","20", "19","11"},
				{"23","17","7","20","18","9"},
				{"23","11","7","20","12","9"},
				{"20","16","7","21","15","7"},
				{"20","19","7","20","19","7"},
				{"20","12","10","24","11","7"},
				{"23","10","7","19","11","10"},
				{"23","20","7","20","18","12"},
				{"19","12","10","23","11","7"}
		};
		
		int[][] levelSolutions = {
				{7,9,4,9,8,2,6,4,1},
				{9,7,4,8,9,1,6,1,2},
				{9,7,4,9,3,1,6,1,2},
				{9,8,4,7,6,2,4,2,1},
				{7,9,4,9,8,2,4,2,1},
				{9,8,7,7,3,1,4,1,2},
				{9,6,4,8,1,2,6,3,1},
				{9,7,4,8,9,1,6,4,2},
				{8,9,6,7,1,3,4,2,1}
		};
		
		Random rand = new Random();
		int int_rand = rand.nextInt(9);
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 14));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 515, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		Game.InitTextfield(frame, textField, 195, 104, 60, 49);
		textField_1 = new JTextField();
		Game.InitTextfield(frame, textField_1, 256, 104, 60, 49);
		textField_2 = new JTextField();
		Game.InitTextfield(frame, textField_2, 316, 104, 64, 49);
		textField_3 = new JTextField();
		Game.InitTextfield(frame, textField_3, 195, 154, 60, 49);
		textField_4 = new JTextField();
		Game.InitTextfield(frame, textField_4, 256, 154, 60, 49);
		textField_5 = new JTextField();
		Game.InitTextfield(frame, textField_5, 315, 154, 65, 49);
		textField_6 = new JTextField();
		Game.InitTextfield(frame, textField_6, 195, 202, 60, 49);
		textField_7 = new JTextField();
		Game.InitTextfield(frame, textField_7, 256, 202, 60, 49);
		textField_8 = new JTextField();
		Game.InitTextfield(frame, textField_8, 315, 202, 65, 49);
		
		JLabel lblNewLabel = new JLabel(levelNumbers[int_rand][0]);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setBounds(166, 104, 28, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(levelNumbers[int_rand][1]);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1.setBounds(166, 142, 28, 49);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(levelNumbers[int_rand][2]);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(176, 191, 19, 49);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(levelNumbers[int_rand][3]);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(195, 71, 45, 35);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(levelNumbers[int_rand][4]);
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(256, 71, 45, 35);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel(levelNumbers[int_rand][5]);
		lblNewLabel_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1.setBounds(312, 69, 45, 37);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JButton btnDone = new JButton("Done");
		btnDone.setForeground(Color.WHITE);
		btnDone.setBackground(Color.BLACK);
		btnDone.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().trim().isEmpty()||textField_1.getText().trim().isEmpty() ||textField_2.getText().trim().isEmpty()||textField_3.getText().trim().isEmpty()||textField_4.getText().trim().isEmpty()||textField_5.getText().trim().isEmpty()|| textField_6.getText().trim().isEmpty()||textField_7.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null,"You have to fill data in all of the boxes","Alert",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
				int[] arr =  {Integer.parseInt( textField.getText()),
						Integer.parseInt( textField_3.getText()),
						Integer.parseInt( textField_6.getText()),
						Integer.parseInt( textField_1.getText()),
						Integer.parseInt( textField_4.getText()),
						Integer.parseInt( textField_7.getText()),
						Integer.parseInt( textField_2.getText()),
						Integer.parseInt( textField_5.getText()),
						Integer.parseInt( textField_8.getText())
					};	
				
				int[] result = levelSolutions[int_rand];
				if (Validate.isLevelFinished(arr, result))
				{
					Winnner w = new Winnner(account);
					try {
						DBConnection.setHighscore(account, 2, score);
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					w.frame.setVisible(true);
				}
				else 
				{
					Over o = new Over(account, "hard");
					o.frame.setVisible(true);
				}
				frame.setVisible(false);
				}
			}
		});
		btnDone.setBounds(214, 262, 109, 35);
		frame.getContentPane().add(btnDone);
		
		btn_Help = new JButton("Need Help?");
		btn_Help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Help h = new Help(account);
				frame.dispose();
				h.frame.setVisible(true);
			}
		});
		btn_Help.setForeground(Color.WHITE);
		btn_Help.setBackground(Color.BLACK);
		btn_Help.setFont(new Font("Arial Black", Font.BOLD, 14));
		btn_Help.setBounds(334, 333, 141, 35);
		frame.getContentPane().add(btn_Help);
		
		lbl_Title = new JLabel("K");
		lbl_Title.setForeground(Color.WHITE);
		lbl_Title.setFont(new Font("Verdana", Font.BOLD, 14));
		lbl_Title.setBounds(45, 78, 28, 34);
		frame.getContentPane().add(lbl_Title);
		
		lbl_Title_1 = new JLabel("A");
		lbl_Title_1.setForeground(Color.WHITE);
		lbl_Title_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lbl_Title_1.setBounds(45, 123, 28, 34);
		frame.getContentPane().add(lbl_Title_1);
		
		lbl_Title_1_1 = new JLabel("K");
		lbl_Title_1_1.setForeground(Color.WHITE);
		lbl_Title_1_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lbl_Title_1_1.setBounds(45, 171, 28, 34);
		frame.getContentPane().add(lbl_Title_1_1);
		
		lbl_Title_1_1_1 = new JLabel("U");
		lbl_Title_1_1_1.setForeground(Color.WHITE);
		lbl_Title_1_1_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lbl_Title_1_1_1.setBounds(45, 215, 28, 34);
		frame.getContentPane().add(lbl_Title_1_1_1);
		
		lbl_Title_1_1_1_1 = new JLabel("R");
		lbl_Title_1_1_1_1.setForeground(Color.WHITE);
		lbl_Title_1_1_1_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lbl_Title_1_1_1_1.setBounds(45, 261, 28, 34);
		frame.getContentPane().add(lbl_Title_1_1_1_1);
		
		lbl_Title_1_1_1_1_1 = new JLabel("O");
		lbl_Title_1_1_1_1_1.setForeground(Color.WHITE);
		lbl_Title_1_1_1_1_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lbl_Title_1_1_1_1_1.setBounds(45, 306, 28, 34);
		frame.getContentPane().add(lbl_Title_1_1_1_1_1);
		
		lbl_Title_1_1_1_2 = new JLabel("Hard Level");
		lbl_Title_1_1_1_2.setForeground(Color.WHITE);
		lbl_Title_1_1_1_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lbl_Title_1_1_1_2.setBounds(89, 11, 102, 34);
		frame.getContentPane().add(lbl_Title_1_1_1_2);
		
		lbl_Score = new JLabel("Score: 800");
		lbl_Score.setForeground(Color.WHITE);
		lbl_Score.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lbl_Score.setBounds(99, 26, 102, 34);
		frame.getContentPane().add(lbl_Score);
		
		JLabel lbl_HighScore = new JLabel("Your Highscore: " + DBConnection.getHighscore(account, 2));
		lbl_HighScore.setForeground(Color.WHITE);
		lbl_HighScore.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lbl_HighScore.setBounds(250, 26, 199, 34);
		frame.getContentPane().add(lbl_HighScore);
		
		JLabel lbl_HighestScore = new JLabel("Highest Score: " + DBConnection.getHighestScore(2));
		lbl_HighestScore.setForeground(Color.WHITE);
		lbl_HighestScore.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lbl_HighestScore.setBounds(250, 41, 199, 34);
		frame.getContentPane().add(lbl_HighestScore);
	}
}
