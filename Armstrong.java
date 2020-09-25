import java.util.*;

class Armstrong
 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number in string:");
	int number=sc.nextInt();
	int b=number;
int result=0,c;
while(number!=0)
{
c=number%10;
result +=(Math.pow(c,3));
number=number/10;
}

if(b==result)
{
	System.out.println("the number is Armstrong..."+result);
}
else
{
	System.out.println("the number is not Armstrong..."+result);
}
}
}