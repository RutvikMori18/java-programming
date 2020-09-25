import java.util.*;

class Pelindrom
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number:");
	int number=sc.nextInt();
	int orignal=number;
int revers=0,digit;
while(number!=0)
{
digit=number%10;
revers=revers*10+digit;
number/=10;

}
if(orignal==revers)
{
System.out.print("the number is pelindrom...");
}
else
{
System.out.print("the number is not pelindrom...");
}
}
}