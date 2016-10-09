import java.util.Scanner;

public class Sodoko {

	public static void main(String[] args) {

		int[][] solution= {{5,3,4,6,7,8,9,1,2},
				           {6,7,2,1,9,5,3,4,8},
				           {1,9,8,3,4,2,5,6,7},
				           {8,5,9,7,6,1,4,2,3},
				           {4,2,6,8,5,3,7,9,1},
				           {7,1,3,9,2,4,8,5,6},
				           {9,6,1,5,3,7,2,8,4},
				           {2,8,7,4,1,9,6,3,5},
				           {3,4,5,2,8,6,1,7,9}
						  };
	
		int[][] pzl= {{5,3,0,0,7,0,0,0,0},
					  {6,0,0,1,9,5,0,0,0},
					  {0,9,8,0,0,0,0,6,0},
					  {8,0,0,0,6,0,0,0,3},
					  {4,0,0,8,0,3,0,0,1},
					  {7,0,0,0,2,0,0,0,6},
					  {0,6,0,0,0,0,2,8,0},
					  {0,0,0,4,1,9,0,0,5},
					  {0,0,0,0,8,0,0,7,9}
				  };
		
		String[] sl = new String[8];
		
		Scanner sc= new Scanner(System.in);
		

		System.out.println("solve sudoku");
		for (int j=0;j<8;j++){ 
		  for (int i=0;i<9;i++)
		  {
			  System.out.print("|"+pzl[j][i]);
		  }
		System.out.println();
		System.out.print("------------------");
		System.out.println();
		}
		int ans = 0;
		while (ans!=3)
		{
			System.out.println("choose:");
			System.out.println("1 for answering");
			System.out.println("4 to check answer");
			System.out.println("2 to  see sol ");
			System.out.println("3 to exit");
			ans= sc.nextInt();
			
			switch (ans)
			{
			case 1:
				System.out.println("enter the sol row by row(separate nbrs with single space");
				String sol;
				for (int i= 0;i<9;i++){
				System.out.println((i+1)+" row");
				sol = sc.next();
				sl[i] = sol;
				}
				
				break;
			case 4:
					break;
			case 2:
				System.out.println("the sol is");
				for (int j=0;j<8;j++){ 
					  for (int i=0;i<9;i++)
					  {
						  System.out.print("|"+solution[j][i]);
					  }
					System.out.println();
					System.out.print("------------------");
					System.out.println();
					}
				break;
			case 3:
				System.out.println("end");
				break;
			}
		}
		
	}

}
