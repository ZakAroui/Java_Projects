/* this is a segment processing program
   authors: Aroui Zakaria
            Ounis Zakaria
   date: 10/12/2013
   file name: TestSegment.java
   purpose: take a segment that is to be entered by the user,
            using multiple choices, then display it, gives it length, set another segment
			or check wether a number x belongs to the segment, all of that is done according 
			to the user's choice.
*/			

import java.util.Scanner; //use the Scanner class from the package util
						  //to get input from the user

class Segment {          // create a class to have all segemt's methods
 private float extr1;    //declaring to private variables that can 
 private float extr2;    //only accessed from this class
 
 public Segment(float ex1, float ex2){  //create a constructor to initialize the segment
	 extr1=ex1;
	 extr2=ex2;
	 if(extr1>extr2)  // swap the two boundaries if the first one is bigger than the
		 swap();  // second one
 }
 
 private void swap(){     // a method that swap the two boundaries
	 float spare=extr1; // creating a spare variable to apply the swapping
	 extr1=extr2;
	 extr2=spare;
 }
 public void set(float x, float y){  // a method that set the boundaries of the segment
     extr1=x;
     extr2=y;
     if(extr1>extr2)                 // swap the boundaries if the first one is bigger than
		 swap();             // the second one
 }
 
 public  float getextr1(){         // a method that get the first boundary
	 return extr1;             // by returning its value
 }
 public float getextr2(){          // a method that get the second boundary
	 return extr2;             // by returning its value
 }
 
 public boolean belongs(float x){   // a method that test if a variable belongs the segment
     return x>=extr1 && x<= extr2;  // it returns true if the variable belongs to the segment
 }
 public float length(){             // a method that calculates the length of the segment
	 return extr2-extr1;        // and returning the length value.
 }
}
public class TestSegment{            // start of the class that contains the main method
	public static void main(String[] args){       // start of the main method
		float ext1,ext2;                      // declaring to variables for the segment's boundaries
		Scanner sc = new Scanner(System.in);  // creating an instance of the class Scanner  
	int ans=0;                                    // declaring an integer to be use to check the entered choices
	while (ans !=6) {                             // start of the first while loop 
		System.out.println("enter 1 to initialize a new segment.");  // give the choice to enter a segment
		System.out.println("enter 6 to quit.");                      // give the choice to quit the program
	  ans=sc.nextInt();                                                  // take an input from the user
	 
		  	
  switch (ans) {                                                     // the first switch that check the choices
	
	 case 1:                                                     // first case, which take the boundaries of a segment
		  System.out.println("enter extr1");
		  ext1=sc.nextFloat();                               // take the first boundary
		  System.out.println("enter extr2");
		  ext2=sc.nextFloat();                               // take the second boundary
		  Segment seg1= new Segment(ext1, ext2);             // create an instance of the class Segment
		  int as = 0;
		  while (as !=6 ) {                                  // the second while loop that gives the choices to process the segment
			  	System.out.println("enter 2 to set extr1 and extr2.");
				System.out.println("enter 3 to display extr1 and extr2.");
				System.out.println("enter 4 to show length.");
				System.out.println("enter 5 to check if a number belongs to the segment.");
				System.out.println("enter 6 to discard the loaded segment.");
			  as=sc.nextInt();  // take the choice number from the user
		  
		  switch (as)             // start of the second switch that check for the given choices
		    {
	           case 2:                // for choice 2, set new boundaries for the segment
	        	   System.out.println("set extr1");
	        	   ext1=sc.nextFloat();
	        	   System.out.println("set extr2");
	        	   ext2=sc.nextFloat();
	        	   seg1.set(ext1, ext2);
	        	   break;                   // to break out from the switch
	           case 3:                          // choice 3, prints the segment
	        	   System.out.println("the existing segment is: ["+seg1.getextr1()+" , "+seg1.getextr2()+"]");
	        	   break;
	           case 4:                          // choice 4, prints the segment's length
	        	   System.out.println("the length of the segment is: "+seg1.length());
	        	   break;
	           case 5:                          // choice 5, to check if a variable belongs to the segment
	        	   System.out.println("enter a number: ");
	        	   int nb=sc.nextInt();
	        	   if (seg1.belongs(nb))
	        		   System.out.println("the number "+nb+" belongs to the segment.");
	        	   else
	        		   System.out.println("the number "+nb+" does not belongs to the segment.");
	        	   break;
	           case 6:          // choice 6, to discard the segment and ask for a new one through the first while loop
	        	   System.out.println("the loaded segment has been discarded.");
	        	   break;
	           default:   // this is for any other choices,which are not valid 
	        	   System.out.println("invalid input!!");
	        	   break;
		    }          // end of the second switch
		  }            // end of the second while loop
		    break;          //to break out from the first choice of the first switch
	
	 case 6:                    //the second choice of the first switch, which ends the program
		 System.out.println("end of the program.");
		 break;
	default :                   // this is for any other choices for the first switch, which are not valid
		System.out.println("invalid input!!");
		break;
	  }     // end of the first switch
	
	}        // end of the first while loop
  }              // end of the main method
	
}                // end of the class that contains the main method
