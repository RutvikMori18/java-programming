import java.util.*;

class ArmstrongFunction
 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number in string:");
	int low=sc.nextInt();
	System.out.print("enter the number in string:");
	int high=sc.nextInt();

while(low<=high)
{
	if(checkPrimeNumber(low))
{
System.out.println("this is prin=me number:"+low);
}
low++;
}

}
}