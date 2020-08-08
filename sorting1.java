import java.util.*;
class sorting1
{
public static void main(String args[])
{
int number[]={14,47,5,16,9,24};
int n=number.length;
System.out.println("Given List is:- ");
for(int i=0;i<n;i++)
{
System.out.print("  "+number[i]);
}
System.out.println("\n");
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
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
for(int i=0;i<n;i++)
{
System.out.print("  "+number[i]);
}
System.out.println("\n");
}
}