import java.util.Scanner;
class AlphabetOrString
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
		System.out.print("Enter anyting without number:");
		String alphabet =sc.nextLine();
		
if(alphabet.length()==1)
{
System.out.print("you were entered alphabet");
}
else
{
System.out.print("you were entered String");
}

}
}