import java.util.*;
class sorting
{
public static void main(String args[])
{
int number[];
number=new int[10];
int i,j,n;
Scanner sc1=new Scanner(System.in);
System.out.print("Enter the size of an array:- ");
n=sc1.nextInt();
System.out.println("Enter the elements of array:-");
for(i=0;i<n;i++)
{
number[i]=sc1.nextInt();
}
System.out.println("Given List is:- ");
for(i=0;i<n;i++)
{
System.out.print("  "+number[i]);
}
System.out.println("\n");
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(number[i]<number[j])
{
int temp=number[i];
number[i]=number[j];
number[j]=temp;
}
}
}
System.out.println("Sorted List is:- ");
for(i=0;i<n;i++)
{
System.out.print("  "+number[i]);
}
System.out.println("\n");
}
}