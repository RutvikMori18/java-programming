import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
		System.out.println("how many number are you enter");
		int a=sc.nextInt();
int add=0;
int d[]=new int[30];

for(int i=1;i<=a;i++)
{
		System.out.print("Enter the number:");
		d[i]=sc.nextInt();
		add= add + d[i];

}
		System.out.print("the sum of your number is:"+add);

}
}