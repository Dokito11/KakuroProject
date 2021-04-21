package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class HardLevel {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HardLevel window = new HardLevel();
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
	public HardLevel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 14));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 515, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if(c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
				{
					return;
				}
				
				if(!Character.isDigit(c)) {
					e.consume();
				}
				else
				{
					textField.setText("");
					return;
				}
			}
		});
		textField.setFont(new Font("Arial Black", Font.BOLD, 14));
		textField.setBounds(195, 104, 60, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if(c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
				{
					return;
				}
				
				if(!Character.isDigit(c)) {
					e.consume();
				}
				else
				{
					textField_1.setText("");
					return;
				}
			}
		});
		textField_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(256, 104, 60, 49);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if(c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
				{
					return;
				}
				
				if(!Character.isDigit(c)) {
					e.consume();
				}
				else
				{
					textField_2.setText("");
					return;
				}
			}
		});
		textField_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(316, 104, 64, 49);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if(c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
				{
					return;
				}
				
				if(!Character.isDigit(c)) {
					e.consume();
				}
				else
				{
					textField_3.setText("");
					return;
				}
			}
		});
		textField_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(195, 154, 60, 49);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if(c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
				{
					return;
				}
				
				if(!Character.isDigit(c)) {
					e.consume();
				}
				else
				{
					textField_4.setText("");
					return;
				}
			}
		});
		textField_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(256, 154, 60, 49);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if(c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
				{
					return;
				}
				
				if(!Character.isDigit(c)) {
					e.consume();
				}
				else
				{
					textField_5.setText("");
					return;
				}
			}
		});
		textField_5.setFont(new Font("Arial Black", Font.BOLD, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(315, 154, 65, 49);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if(c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
				{
					return;
				}
				
				if(!Character.isDigit(c)) {
					e.consume();
				}
				else
				{
					textField_6.setText("");
					return;
				}
			}
		});
		textField_6.setFont(new Font("Arial Black", Font.BOLD, 14));
		textField_6.setColumns(10);
		textField_6.setBounds(195, 202, 60, 49);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if(c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
				{
					return;
				}
				
				if(!Character.isDigit(c)) {
					e.consume();
				}
				else
				{
					textField_7.setText("");
					return;
				}
			}
		});
		textField_7.setFont(new Font("Arial Black", Font.BOLD, 14));
		textField_7.setColumns(10);
		textField_7.setBounds(256, 202, 60, 49);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if(c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
				{
					return;
				}
				
				if(!Character.isDigit(c)) {
					e.consume();
				}
				else
				{
					textField_8.setText("");
					return;
				}
			}
			
		});
		textField_8.setFont(new Font("Arial Black", Font.BOLD, 14));
		textField_8.setColumns(10);
		textField_8.setBounds(315, 202, 65, 49);
		frame.getContentPane().add(textField_8);
		
		JLabel lblNewLabel = new JLabel("24");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setBounds(166, 104, 28, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("15");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1.setBounds(166, 142, 28, 49);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("7");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(176, 191, 19, 49);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("20");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(195, 71, 45, 35);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("16");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(256, 71, 45, 35);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("10");
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
				int[] arr =  {Integer.parseInt( textField.getText()),Integer.parseInt( textField_1.getText()),Integer.parseInt( textField_2.getText()),
						Integer.parseInt( textField_3.getText()),
						Integer.parseInt( textField_4.getText()),

						Integer.parseInt( textField_5.getText())
						,Integer.parseInt( textField_6.getText()),
						Integer.parseInt( textField_7.getText()),
						Integer.parseInt( textField_8.getText()),
					
				};	
				
				int[] result = {9,8,7,7,6,2,4,2,1};
				for(int i = 0 ; i<arr.length ; i++)
				{
					if(arr[i] != result[i])
					{
						Over o = new Over("hard");
						o.frame.setVisible(true);
						frame.setVisible(false);
						break;
		
					}
					else if (i == arr.length - 1 && arr[i] == result[i]) {
						Winnner w = new Winnner();
						w.frame.setVisible(true);
						frame.setVisible(false);
						break;
					}
					
				}}
			}
				
		});
		btnDone.setBounds(214, 262, 109, 35);
		frame.getContentPane().add(btnDone);
		
		btn_Help = new JButton("Need Help?");
		btn_Help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Help h = new Help();
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
	}

}
