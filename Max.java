import java.util.Scanner;

class Max
{

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter the first number:");
	int a=sc.nextInt();
	System.out.print("Enter the second number:");
	int b=sc.nextInt();
	System.out.print("Enter the third number:");
	int c=sc.nextInt();
if(a>=b && a>=c)
{
	System.out.println(" the first numberis max");
}
else if(b>=a && b>=c)
{
	System.out.println(" the second numberis max");
}
else
{
	System.out.println(" the third numberis max");
}
}
}