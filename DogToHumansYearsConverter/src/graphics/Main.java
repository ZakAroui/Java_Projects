package graphics;

import javax.swing.JFrame;

/**
 * Purpose: this program is an introduction to how to create a window
 * and add to it a title,textField, button and label. Furthermore, it shows
 * how can a user interact with the program.
 * 
 * @version 1.01
 * @author zaki(copied and edited)
 *
 */
public class Main  {

	public static void main(String[] args) {

		/*
		//simple window
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		//window with a title
		titleWindow tw = new titleWindow();
		tw.setVisible(true);
		
		
		//window with a title and a text
		InsertText it = new InsertText();
		it.setVisible(true);

		//window with button, label and textField
		Dog1 dg = new Dog1();
		dg.setVisible(true);
		
		*/
		
		//window with interaction
		Dog2 dg2 = new Dog2();
		dg2.setVisible(true);
}
}
