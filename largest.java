import java.util.*;
 class largest
{
public static void main(String args[])
{
int a,b,c;
Scanner sc1=new Scanner(System.in);
System.out.println("enter the value of a");
a=sc1.nextInt();
System.out.println("enter the value of b");
b=sc1.nextInt();
System.out.println("enter the value of c");
c=sc1.nextInt();
if(a>b && a>c)
System.out.println("a is greater");
else if(b>a && b>c)
System.out.println("b is greater");
else
System.out.println("c is greater");
}
}