import java.util.*;

class Febonacci
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  the number in which you got Febonacci");
	int number=sc.nextInt();
System.out.println("your Febonacci seris till your number is below");
int i=1;
int a=0;
int b=1;
int result=0;
System.out.print(a+" + "+b);
do
{
result=a+b;
a=b;
b=result;
System.out.print(" + "+result);
i++;
}while(result<=number && i<=number);

}

}