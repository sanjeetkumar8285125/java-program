import java.util.*;
class factorial
{
public static void main(String args[])
{
int n,i,fact=1;
Scanner sc1=new Scanner(System.in);
System.out.println("enter the Number");
n=sc1.nextInt();
for(i=1;i<=n;i++)
fact=fact*i;
System.out.println("Factorial of "+n+" is = "+fact);
}
}