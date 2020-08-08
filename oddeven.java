import java.util.*;
class oddeven
{
public static void main(String args[])
{
int n;
Scanner sc1=new Scanner(System.in);
System.out.println("entered the number");
n=sc1.nextInt();
if(n%2==0)
System.out.println(n+" is an even number");
else
System.out.println(n+" is an odd number");
}
}