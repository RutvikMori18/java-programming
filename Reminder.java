import java.util.Scanner;

class Reminder
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:");
	int a=sc.nextInt();
	System.out.print("Enter the number which you divide:");
	int b=sc.nextInt();
	int quotient=a/b;
	int reminder=a%b;
	System.out.println("your quotient is :"+quotient);
	System.out.println("your reminder is :"+reminder);
}

}