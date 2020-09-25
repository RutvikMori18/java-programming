import java.util.*;

class EvenOdd
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number which are you check:");
		int a=sc.nextInt();
		if((a%2)!=0)
{
			System.out.println("the number is ODD");
}
else
{
			System.out.println("the number is EVEN");
}
}

}