import java.util.Scanner;

class Multiplication
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number which you have get table:");
	int number=sc.nextInt();
for(int i=1;i<=10;i++)
{
	System.out.println(number+" * "+i+" = "+(number*i));
}
}

}