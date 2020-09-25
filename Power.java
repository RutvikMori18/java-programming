import java.util.*;

class Power
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the base:");
	int base=sc.nextInt();
	System.out.print("Enter the power:");
	int power=sc.nextInt();
	System.out.print("the power of your number is:"+Math.pow(base,power));
}

}