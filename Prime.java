import java.util.*;

class Prime
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number:");
	int number=sc.nextInt();
if(number%2==0||number%3==0||number%5==0||number%7==0)
{
System.out.print("the number is not prime...");
}
else
{
System.out.print("the number is prime...");
}
}
}