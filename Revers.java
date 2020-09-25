import java.util.*;

class Revers
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number:");
	int number=sc.nextInt();	
int reminder=0, digit=0;
while(number!=0)
{
digit=number%10;
reminder= reminder*10+digit;
number=number/10;
}
System.out.print("your revers number is"+reminder);
}
}