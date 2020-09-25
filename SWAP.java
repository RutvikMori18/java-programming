import java.util.*;

class SWAP
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number a");
	int a= sc.nextInt();
	System.out.println("enter the number b");
	int b= sc.nextInt();
	int c=a;
	a=b;
	b=c;
System.out.println("the number a is swap"+a);
System.out.println("the number b is swap"+b);
}
}