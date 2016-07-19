import java.util.Scanner;
public class ResultDemo {
	public static void main(String args[])
	{ ResultGen re=new ResultGen();
		System.out.println("enter the name of the student");
	    Scanner scn =new Scanner(System.in);
	    String name=scn.nextLine();
	    System.out.println("enter the student roll number");
		Scanner scn4= new Scanner(System.in);
		int Studentroll=	scn4.nextInt();
		System.out.println("enter the registration number");
		Scanner scn5= new Scanner(System.in);
		int regnumber=	scn5.nextInt();
		System.out.println("enter the marks of subject1");
		Scanner scn1= new Scanner(System.in);
		int m1=	scn1.nextInt();
		System.out.println("enter the marks of subject2");
		Scanner scn2= new Scanner(System.in);
		int m2=	scn2.nextInt();
		System.out.println("enter the marks of subject3");
		Scanner scn3= new Scanner(System.in);
		int m3=	scn3.nextInt();
		re.result(m1, m2, m3, name);
	}
}
