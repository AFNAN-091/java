package Panels;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lecture1 {

	public static void main(String[] args) {
		// JPanel is a gui component that function as a container to hold other components
		
		JLabel label = new JLabel();
		
		label.setText("i would ");
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0,0,0));
		panel.setBounds(0,60,350,500);
		
		JPanel greenpanel = new JPanel();
		greenpanel.setBackground(Color.GREEN);
		greenpanel.setBounds(350,60,350,500);
		JFrame  frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(720,720);
		frame.setLayout(null);
		
		frame.setTitle("AFnaN!");
		frame.setVisible(true);
		frame.add(panel);
		frame.add(greenpanel);
		panel.add(label);
	}

}
