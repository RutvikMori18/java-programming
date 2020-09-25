import java.util.Scanner;
class PositiveNegative
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int number =sc.nextInt();
if(number>0)
{
System.out.print("the number is Positive...");
}
else if(number<0)
{
System.out.print("the number is Negative...");
}
else
{
System.out.print("the number is unexpeted...");
}


}
}