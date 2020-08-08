import java.util.*;
class table
{
public static  void main(String args[])
{
int x,mul,i;
Scanner sc1=new Scanner(System.in);
System.out.println("enter the number");
x=sc1.nextInt();
for(i=1;i<=10;i++)
{
mul=x*i;
System.out.println(x+"*"+i+"="+mul);
}
}
}