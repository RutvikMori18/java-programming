import java.util.Scanner;

class ASCII
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the alphabet:");
	char a=sc.next().charAt(0);
	
	System.out.println("Your ASCII value is:"+(int)a);
}
}	
