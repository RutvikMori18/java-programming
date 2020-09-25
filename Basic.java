class Salary
{
int hra,da,basic;


Salary(int b,int h,int d)
{
	basic=b;
	hra=(basic*h)/100;
	da=(basic*d)/100;
}


}

class GrossSalary extends Salary
{
int medical;
GrossSalary(int b,int d,int h,int m)
{
super.basic=b;
super.da=d;
super.hra=h;
medical=m;
}
int ComputeSalary(){

return basic+da+hra;
}
int ComputeMedical(){

return basic+da+hra+medical;
}

}
class Basic
{
public static void main(String []args){

GrossSalary g1=new GrossSalary(5000,10,20,500);
GrossSalary g2=new GrossSalary(7000,15,25,750);
double sal,med;

sal=g1.ComputeSalary();
med=g1.ComputeMedidcal();
System.out.println("gross salary is..."+sal);
System.out.println("your gross salary with medical..."+med);

sal=g2.ComputeCalary();
med=g2.ComputeMedical();
System.out.println("gross salary of g2 is..."+sal);
System.out.println("gross salary of g2 with medical is.."+med);
}
}