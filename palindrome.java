import java.util.*;
class palindrome
{
public static  void main(String args[])
{
int x,digit,rev=0,i;
Scanner sc1=new Scanner(System.in);
System.out.println("enter the number");
x=sc1.nextInt();
i=x;
while(x!=0)
{
digit=x%10;
rev=(rev*10)+digit;
x=x/10;
}
if(rev==i)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}