import java.util.*;

class ArmstrongInterval
 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number in string:");
	int low=sc.nextInt();
	int b=low;
	System.out.print("enter the number in string:");
	int high=sc.nextInt();
int result=0,c;
for(int i=low+1;i<high;i++)
{
int digits=0;
int result=0;
int orignal=i;
while(orignal!=0)
{
orignal /=10;
++digits;
}
orignal=i;
}
while(orignal!=0)
{
int reminder=orignal%10;
result+=Math.pow(reminder,digits);
orignal/=10;
}
if(b==result)
{
	System.out.println("the number is Armstrong..."+result);
}

}
}