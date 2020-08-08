import java.util.*;
class grade
{
public static void main(String args[])
{
int x;
Scanner sc1=new Scanner(System.in);
System.out.println("enter the marks of the student");
x=sc1.nextInt();
if(x>80 && x<=100)
System.out.println("Grade A");
else if(x>60 && x<=80)
System.out.println("Grade B");
else if(x>40 && x<=60)
System.out.println("Grade C");
else
System.out.println("Grade D");
}
}
