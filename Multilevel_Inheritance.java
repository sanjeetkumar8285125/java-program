import java.util.*;
class firstclass
{
int i,j;
void get_first(int a,int b)
{
i=a;
j=b;
}
}
class secondclass extends firstclass
{
int k;
void get_second(int c)
{
k=c;
}
}
class thirdclass extends secondclass
{
int l;
void get_third(int m)
{
l=m;
}
void display()
{
System.out.println("The value of the superclass's i="+i+" and j="+j);
System.out.println("The value of the Intermediate's k is "+k);
System.out.println("The value of the Subclass's l is "+l);
}
}
class Multilevel_Inheritance
{
public static void main(String args[])
{
	thirdclass obj=new thirdclass();
	obj.get_first(7,5);
	obj.get_second(8);
	obj.get_third(14);
	obj.display();
}
}