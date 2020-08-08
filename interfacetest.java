interface i1
{
public void m();
int i=10;
}
interface i2
{
public void m();
int i=100;
}
class interfacetest implements i1,i2
{
public void m()
{
System.out.println("Child Class");
System.out.println("i in i1 = "+i1.i);
System.out.println("i in i2 = "+i2.i);
}
public static void main(String a[])
{
interfacetest obj=new interfacetest();
obj.m();
}
}