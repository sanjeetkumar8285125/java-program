import java.util.*;
class matrixsum
{
public static void main(String args[])
{
int a[][]={{4,9,7},{5,4,7},{4,5,6}};
int b[][]={{2,1,6},{4,3,8},{2,5,3}};
int l=a.length;
System.out.println(" First Matrix is :-");
for(int i=0;i<l;i++)
{
for(int j=0;j<l;j++)
{
System.out.print("   "+a[i][j]);
}
System.out.print("\n");
}
int m=b.length;
System.out.println(" Second Matrix is :-");
for(int i=0;i<m;i++)
{
for(int j=0;j<m;j++)
{
System.out.print("   "+b[i][j]);
}
System.out.print("\n");
}
System.out.println(" Summation of two matrix is:-");
for(int i=0;i<m;i++)
{
for(int j=0;j<m;j++)
{
System.out.print("   "+(a[i][j]+b[i][j]));
}
System.out.print("\n");
}
}
}