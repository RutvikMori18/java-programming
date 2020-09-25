import java.util.*;

class PrimeInterval
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number:");
	int number1=sc.nextInt();
	System.out.print("enter the number:");
	int number2=sc.nextInt();
while(number1<=number2)
{
if(number1%2==0||number1%3==0||number1%5==0||number1%7==0)
{
System.out.println("the number is not prime..."+number1);
}
else
{
System.out.println("the number is prime..."+number1);
}
number1++;
}
}
}