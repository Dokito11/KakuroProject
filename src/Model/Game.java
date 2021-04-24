package Model;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Game {

	// Checks Input - Only allows digits or delete button and replaces current number with new one
	public static void input(KeyEvent e, JTextField txtField)
	{
		char c = e.getKeyChar();
		
		if(c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
		{ return; }
		
		if(!Character.isDigit(c)) 
		{ e.consume(); }
		else
		{ txtField.setText(""); return; }
	}
	
	// Initializes Textfields
	public static void InitTextfield(JFrame frame, JTextField txtField, int x, int y, int width, int height)
	{
		txtField.setFont(new Font("Arial Black", Font.BOLD, 14));
		txtField.setBounds(x,y,width,height);
		txtField.setColumns(10);
		frame.getContentPane().add(txtField);
		txtField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				input(e, txtField);
			}
		});
	}
}
