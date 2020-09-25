import java.util.Scanner;
class LeapYear
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the year which are you check:");
		int year=sc.nextInt();
	if(year%4==0||year%100==0||year%400==0)
	{
		System.out.println("the year "+year+"is LEAP year..."); 
	} 
	else
	{
		System.out.println("the year "+year+"is not LEAP year..."); 
	}
}
}