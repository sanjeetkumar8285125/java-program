import java.util.*;
class room
{
double length,breadth;
room(double x,double y)
{
length=x;
breadth=y;
}
room(double x)
{
length=breadth=x;
}
double area()
{
return(length * breadth);
}
}
class area1
{
public static void main(String args[])
{
room r1=new room(14.8,27.1);
room r2=new room(18.5);
System.out.println("Area of rectangle is "+r1.area());
System.out.println("Area of rectangle is "+r2.area());
}
}