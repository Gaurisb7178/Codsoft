package codesoft;
import java.util.Scanner;
public class GradeSystem {
	public static void MarkScheme()
	{
		System.out.println("----Grade Distribution Chart----");
		System.out.println("Percentage \t\t Grade \t\t Remarks");
		System.out.println("90-100 \t\t\t O \t\t Outstanding");
		System.out.println("80-89 \t\t\t A \t\t Excellent");
		System.out.println("70-79 \t\t\t B \t\t Very Good");
		System.out.println("60-69 \t\t\t C \t\t Good");
		System.out.println("50-59 \t\t\t D \t\t Can Do Better");
		System.out.println("40-49 \t\t\t E \t\t Pass");
		System.out.println("Less than 40 \t\t F \t\t Needs to Improve");
	}
	public static String CalculateGrade(double avgpercent) 
	{
		if (avgpercent >= 90 )return "O";
		else if(avgpercent >=80)return "A";
		else if(avgpercent >=70)return "B";
		else if(avgpercent >=60)return "C";
		else if(avgpercent >=50)return "D";
		else if(avgpercent >=40)return "E";
		else return"F";
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int total=0;
		System.out.println("---STUDENT GRADE CALCULATOR---");
		System.out.println("Enter the Number of Subjects of Student: ");
		int n=sc.nextInt();
		int marks[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the marks of Subject "+(i+1)+": ");
			marks[i]=sc.nextInt();
			total+=marks[i];
		}
		System.out.println();
		MarkScheme();
		double avgpercent=total/n;
		String grade=CalculateGrade(avgpercent);
		System.out.println();
		System.out.println("Total: "+total);
		System.out.println("Average Percentage: "+avgpercent);
		System.out.println("Grade: "+grade);
		}
}
