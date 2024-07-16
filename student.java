import java.util.Scanner;
public class student
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("enter the mark for subject 1:");
		int sub1 =scan.nextInt();
		
		System.out.println("enter the mark for subject 2:");
		int sub2 =scan.nextInt();
		
		System.out.println("enter the mark for subject 3:");
		int sub3 =scan.nextInt();
		
		System.out.println("enter the mark for subject 4:");
		int sub4 =scan.nextInt();
		
		System.out.println("enter the mark for subject 5:");
		int sub5 =scan.nextInt();
		
		int sum=sub1+sub2+sub3+sub4+sub5;
		System.out.println("the sum of five subjects is:"+sum);
		
		int avg=sum/5;
		System.out.println("avg of five subjects marks is:"+avg);
		
		if(avg>=50 && avg<=60)
		{
			System.out.println("the grade is C");
		}
		
		else if(avg>=60 && avg<=70)
		{
			System.out.println("the grade is B");
		}
		
		else if(avg>=70 && avg<=80)
		{
			System.out.println("the grade is B+");
		}
		
		else if(avg>=80 && avg<=90)
		{
			System.out.println("the grade is A");
		}
		
		else if(avg>=90 && avg<=99)
		{
			System.out.println("the grade is A+");
		}
		
		else
		{
			System.out.println("FAIL");
		}
		
}
}