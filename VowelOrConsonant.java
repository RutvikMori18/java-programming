import java.util.Scanner;

class VowelOrConsonant
{
	public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the alphabet :");
char a=sc.next().charAt(0);
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
{
System.out.print("the alphabet is Vowel");
}
else
{
System.out.print("the alphabet is Consonant");
}

}


}