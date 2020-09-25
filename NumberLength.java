import java.util.*;

class NumberLength
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:");
	int number=sc.nextInt();
	int b,count=0;
		
	while(number!=0)
{
number=number/10;

++count;

}
	System.out.print("your number length is :"+count);
}
}