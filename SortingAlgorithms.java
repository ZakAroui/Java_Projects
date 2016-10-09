
import java.util.*;

/**
 * this is a Sorting Algorithms program
 * 
 * @authors Aroui Zakaria
 *          Ounis Zakaria
 *          
 * @date: 28/01/2014 
 * @fileName: SortingAlgorithms.java
 * 
 * @purpose: this program takes an integer number from the user 
 * and use it to set the size of an array of random numbers, then
 * it calls different sorting algorithms: Bubble, Inserting, Selection 
 * and the java built in method. Finally, it gives the execution time
 * for each algorithm and print the sorted array.   
 *
 */
class SortingAlg{
	
	public static int[] b1, I1, S1;// arrays to hold the content of sorted arrays
	/**
	 * this is the bubble sorting algorithm method
	 * it compares every two neighbor number going throw
	 * the array n times.where n is the array length
	 */
	public static void bubble(int[] a)
	{
		
		for (int i= 0; i <a.length-1; i++) {
		      for (int j= 0; j <a.length-1; j++) {
		        if (a[j] > a[j+1])
		        {
		          int t = a[j];
		          a[j]= a[j+1];
		          a[j+1]= t;
		        }
		      }
		    }
		b1 = new int[a.length]; //set the same size as the sorted array
		b1 = a;// store the sorted array 
	}
	/**
	 *  this is the insertion sorting algorithm method
	 *  it takes and element of the array and compare it 
	 *  the other elements of the array, then do the same thing
	 *  for all others.
	 */
	public static void insertion(int[] a)
	{
	        int i, k, y;
	        
	        for ( k = 1; k < a.length; k++) {
				y = a[k];
				
				for ( i = k-1; i >=0 && y<a[i]; i--) {
					a[i+1] = a[i];
					a[i] = y;
				}
			}
	        I1 = new int[a.length];//set the same size as the sorted array
			I1 = a;// store the sorted array

	        
	}
	/**
	 *this is the selection sorting algorithm method
	 *it suggests the first element as the large one
	 *and then compares it to the other elements and it is
	 *switch it with the last one in the array and repeat 
	 *the procedure. 
	 */
	public static void selection(int[] a)
	{
	  
		int n = a.length;
		int i, indx, j, large;
		
		large = a[0];
		indx = 0;
		
		for (i = n-1; i>0; i--) {
			large = a[0];
			indx = 0;
			
			for(j=1; j<=i; j++)
				if(a[j]>large){
					large = a[j];
					indx = j;
				}
				a[indx] = a[i];
				a[i] = large;
			
			
		}
		S1 = new int[a.length];//set the same size as the sorted array
		S1 = a;// store the sorted array
		
	}
}

public class SortingAlgorithms {

	public static void main(String[] args) {
		
		Scanner inpt = new Scanner(System.in);
		Random rd= new Random();
		long time;
		
		//ask the user for the size of the array
		System.out.println("enter the number of premetives to be set randomly and then sorted.");
		int n= inpt.nextInt();
		
		//set the size of the arrays, all the same.
		int[] sort= new int[n];
		int[] bubble= new int[n];
		int[] selection= new int[n];
		int[] insertion= new int[n];
		
		// fill the arrays with random values, all the same.
		int rdVar;
		for(int i=0; i<n; i++)
		{
			rdVar= rd.nextInt()%1000;
			bubble[i]= rdVar;
			selection[i]= rdVar;
			insertion[i]= rdVar;
			sort[i]= rdVar;
		}
		
		// calculate time before and after calling
		// then subtract them to get the time of execution
		time= System.nanoTime();
		SortingAlg.bubble(bubble);
		time= System.nanoTime() - time;
		System.out.println("The execution time for the Bubble sorting is: "+time+" ns.");
		int[] b2 = SortingAlg.b1; //get the sorted array
		display(b2);// call display to show the sorted array
		
		time= System.nanoTime();
		SortingAlg.selection(selection);
		time= System.nanoTime() - time;
		System.out.println("The execution time for the Selection sorting is: "+time+" ns.");
		int[] S2 = SortingAlg.S1;
		display(S2);
		
		time= System.nanoTime();
		SortingAlg.insertion(insertion);
		time= System.nanoTime() - time;
		System.out.println("The execution time for the Insertion sorting is: "+time+" ns.");
		int[] I2 = SortingAlg.I1;
		display(I2);
		
		time= System.nanoTime();
		Arrays.sort(sort);// call the java built in sorting method
		time= System.nanoTime() - time;
		System.out.println("The execution time for the java built in method is: "+time+" ns.");
		display(sort);
		
		
	}

	/**
	 * this method accepts an array as an argument 
	 * and then it displays it to the user
	 */
	private static void display(int[] a) {
		for (int i = 0; i < a.length; i++) 
			System.out.print(a[i]+" ");
		System.out.println("\n");
	}

}
