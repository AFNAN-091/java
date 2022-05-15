package Labels;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
public class Lecture1 {

	public static void main(String[] args) {
		
		// JLable a GUI display area for a string 
		// of text, an image, or both
		
		JLabel label = new JLabel();
		
		//ImageIcon img = new ImageIcon("E:\\Java\\JavaSwing\\src\\Labels\\fb.png");
		
		Border bor = BorderFactory.createLineBorder(Color.pink,10);
		
		// set text of label
		label.setText("now i am learning java swing! ");
		//label.setIcon(img);
		// set text center, right, left
		label.setHorizontalTextPosition(JLabel.CENTER);
		// set text center, top, bottom
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setForeground(new Color(211,89,11));
		//SET FONT 
		label.setFont(new Font("My Boli",Font.ROMAN_BASELINE,21));
		// set gap of text to image
		//label.setIconTextGap(100);
		
		label.setBackground(Color.BLACK);//set background clr
		label.setOpaque(true); // display background clr
		label.setBorder(bor);
		label.setBounds(50,70,300,300);//set x,y and width, height
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);// frame.pack() adjust the 
		frame.setSize(500,500);// component size replace by setbouds
		// frame.setsize, setlayout
		frame.setVisible(true);
		frame.add(label);
		
	}

}
