import java.util.*;
class A
{
void call()
{
System.out.println("Inside A's call method");
}
}
class B extends A
{
void call()
{
System.out.println("Inside B's call method");
}
}
class C extends A
{
void call()
{
System.out.println("Inside C's call method");
}
}
class dispatch
{
public static void main(String args[])
{
A a=new A();
B b=new B();
C c=new C();
A r;
r=a;
r.call();
r=b;
r.call();
r=c;
r.call();
}
}