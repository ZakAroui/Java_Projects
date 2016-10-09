package graphics;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Dog2 extends JFrame {
	
	private static final int DOG_YEARS_PER_HUMAN_YEAR = 7;
	
	private  JTextField _humanYearsTF = new JTextField(3);
	private  JTextField _dogYearsTF = new JTextField(3);
	
	JPanel ct =new JPanel();

	public Dog2() {
        // create a button
		JButton convertBtn = new JButton("Convert"); 
		
			//the interaction with the user
			//do the conversion if button pressed
			convertBtn.addActionListener(new ConvertBtnListener());
			// take the entered value of dog years to do the conversion
			_dogYearsTF.addActionListener(new ConvertBtnListener());
		
		// the field can't be edited
		_humanYearsTF.setEditable(false);
		
		// create a window with panel,button, textfields, title ...
		 JPanel content = new JPanel();
		content.setLayout(new FlowLayout());
		content.add(new JLabel("Dog Years"));
		content.add(_dogYearsTF);
		content.add(convertBtn);
		content.add(new JLabel("Human Years"));    
		content.add(_humanYearsTF);
		ct = content;
		setContentPane(content);
		pack(); 
		setTitle("Dog Year Converter"); 
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // Center window.
	}
	
	 class ConvertBtnListener  implements ActionListener  { 
		
		public void actionPerformed(ActionEvent e) {
			
			//get dog years as string and convert it to int
			String dyStr = _dogYearsTF.getText();
			int dogYears = Integer.parseInt(dyStr);
			
			//calculate human years
			int humanYears = dogYears * DOG_YEARS_PER_HUMAN_YEAR;
			
			//set the value of human years
			_humanYearsTF.setText(""+ humanYears);
				
			// to display the result in the same frame;but different panel
			//create a back button, to get to the first panel
			JButton back = new JButton("back");
			
			back.addActionListener(new backListener());
								
			JPanel cont = new JPanel();
			cont.setLayout(new FlowLayout());
			cont.add(new JLabel("Human Years")); 
			cont.add(_humanYearsTF);
			cont.add(back);
			setContentPane(cont);
			pack();
			setSize(200, 200);
								
		}
	}
	 class backListener implements ActionListener {
		 public void actionPerformed(ActionEvent e1){
			 	
			 // set the the first panel, when back is clicked
			 setContentPane(ct);
			 pack();
			 setSize(200,200);
			 
		 }
	 }
	
	
}
