package graphics;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InsertText extends JFrame {
	
	public InsertText() {

		//Create content panel and set layout 
		JPanel content = new JPanel();
		content.setLayout(new FlowLayout());
		
		//... Add one label to the content pane.
		JLabel greeting = new JLabel("Hello ya jma3a.");
		content.add(greeting); 
		
		//... Set window (JFrame) characteristics 
		setContentPane(content);
		pack();
		
		setTitle("Mr Me"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setLocationRelativeTo(null); // Center window on screen.
	}

}
