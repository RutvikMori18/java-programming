class parent 
{
	void p1(){
	System.out.println("this is parant class...");
}
}

class Child extends parent
{
	void p2(){
	System.out.println("this is child class...");
		}
public static void main(String []args){

	Child c=new Child();
	c.p2();
	c.p1();
}
}

