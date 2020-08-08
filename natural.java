import java.util.*;
class natural
{
public static  void main(String args[])
{
int x,sum=0,i;
Scanner sc1=new Scanner(System.in);
System.out.println("enter the number");
x=sc1.nextInt();
for(i=1;i<=x;i++)
sum=sum+i;
System.out.println("sum is first "+x+" natural number is = "+sum);
}
}