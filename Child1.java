class Student
{
	int x;
int Super(int x)
{
		this.x=x;
return x;
}
void disp()
{
		System.out.println("super X:"+x);
}
}
class Child1 extends Student
{
	int y;
int Sub(int x,int y)
{
	
		Super(x);

		this.y=y;
return y;
}
void disp()
{
		System.out.println("this x is sub..."+x);
		System.out.println("this y is sub..."+y);
}

public static void main(String []args)
{
		Child1 c=new Child();
		c.Sub(100,200);
		c.disp();
}

}