import java.util.*;

class PrimeFunction
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
	if(PrimeNumber(low))
{
System.out.println("this is prin=me number:"+low);
}
++low;
}
public static boolean PrimeNumber(int num){
boolean flag=true;
for(int i=2;i<=num/2;++i)
{
if(num%i==0)
{
flag=flase;
break;
}
}
return flag;
}

}
}