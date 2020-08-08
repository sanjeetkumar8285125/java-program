import java.util.*;
class calculator
{
public static void main(String args[])
{
int x,y,a,sum;
Scanner sc1=new Scanner(System.in);
System.out.println("enter the value of x");
x=sc1.nextInt();
System.out.println("enter the value of y");
y=sc1.nextInt();
System.out.println("menu driven calculator");
System.out.println("1.add");
System.out.println("2.substract");
System.out.println("3.multiply");
System.out.println("4.divide");
System.out.println("enter your choice");
a=sc1.nextInt();
switch(a)
{
case 1:
sum=x+y;
System.out.println("sum of the number is "+sum);
break;
case 2:
sum=x-y;
System.out.println("differnce of the number is "+sum);
break;
case 3:
sum=x*y;
System.out.println("product of the number is "+sum);
break;
case 4:
sum=x/y;
System.out.println("division of the number is "+sum);
break;
default:
System.out.println("wrong choice");
}
}
}