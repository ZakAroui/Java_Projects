package graphics;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Dog1 extends JFrame {
	private JTextField humanYearsTF = new JTextField(5); 
	private JTextField dogYearsTF = new JTextField(3);
	
	public Dog1() {
		//create a button
		JButton convertBtn = new JButton("Convert"); 
		
		//create panel
		JPanel content = new JPanel(); 
		content.setLayout(new FlowLayout());
		
		//add different things to the panel
		content.add(new JLabel("Dog Years")); 
		content.add(dogYearsTF);
		content.add(convertBtn);
		content.add(new JLabel("Human Years")); 
		content.add(humanYearsTF); 
		
		//window attributes
		setContentPane(content); 
		pack(); 
		
		setTitle("Dog Year Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setLocationRelativeTo(null); 
		
	}

}
