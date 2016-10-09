import java.util.Scanner;

class Student
{
	private String name;
	private int n;
	private float  a[] ;
	private float avg=0;
	
	
	public Student(String nam, int nn)
	{
		name=nam;
		n=nn;
		a = new float[n];
	}
	public void setGrade()
	{
		 Scanner sc = new Scanner(System.in);
		for (int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public float gradeAv()
	{
		for(int i=0;i<n;i++)
		{
			avg+=a[i];
		}
		return avg/n;
	}
	public String name()
	{
		return name;
	}
	public float[] gradeList()
	{
		return a;
	}
}

public class testStudent {

	public static void main(String[] args) {
		Scanner nme = new Scanner(System.in);
		int as=0;
		while (as !=2)
		{
			System.out.println("enter 1 to load a student's data");
			System.out.println("enter 2 to quit");
			as = nme.nextInt();
			switch (as)
			{
			
			case 1:
			
		System.out.print("enter the name of the student: ");
		String nm = nme.next();
		System.out.print("enter the number of modules to be entered: ");
		int m = nme.nextInt();
		System.out.println("enter the grades one by one: ");
				
		Student stdnt = new Student(nm, m);
		stdnt.setGrade();
		
		int ans=0;
		while (ans!= 4)
		{
			System.out.println("enter 1 to see the student's name.");
			System.out.println("enter 2 to see the student's grade average.");
			System.out.println("enter 3 to see the student's grade list.");
			System.out.println("enter 4 to load another student's data.");
			ans = nme.nextInt();
			switch (ans)
			{
			case 1:
				System.out.println("the student's name is: "+ stdnt.name());
				break;
			case 2:
				System.out.println("the student's grade average is: "+ stdnt.gradeAv());
				break;
			case 3:
				float[] b= new float[m];
				b= stdnt.gradeList();
				System.out.println("the student's grade list is: ");
				for (int i=0;i<m;i++)
				{
					System.out.print(b[i]+" ");
				
				}
				System.out.println();
				break;
			case 4:
				System.out.println("another student's turn");
				break;
			default:
				System.out.println("invalid input!");
				break;
			}
		}
		break;
			case 2:
				System.out.println("the end of the program");
				break;
			default:
				System.out.println("invalid input!");
				break;
			}
		}
			

	}

}
