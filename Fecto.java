import java.util.Scanner;
class Fecto
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the nnumber:");
	int a=sc.nextInt();
int result=1;
for(int i=1;i<=a;i++)
{
	result=result*i;
}
	System.out.print("the result of your result:"+result);
}
}