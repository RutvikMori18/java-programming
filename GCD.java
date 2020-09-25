import java.util.*;

class GCD
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number first:");
	int a=sc.nextInt();
	System.out.println("Enter the number second:");
	int b=sc.nextInt();
int GCD=0;
for(int i=1;i<=a && i<=b;i++)
{
	if(a%i==0 && b%i==0)
{
	GCD=i;
}

}
System.out.print("the two number"+a+" & "+b+" GCD is:"+GCD);
}
}