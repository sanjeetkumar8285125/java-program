import java.util.*;
class account
{
String name;
double acno;
String type;
double amt;
Scanner sc1=new Scanner(System.in);
void getdata()
{
System.out.println("Enter the name");
name=sc1.next();
System.out.println("Enter the account no.");
acno=sc1.nextInt();
System.out.println("Enter the type of account");
type=sc1.next();
System.out.println("enter the balance amount in account");
amt=sc1.nextInt();
}
}
class saving extends account
{
void deposit()
{
double bal;
System.out.println("Enter the amount to deposit");
bal=sc1.nextInt();
amt=amt+bal;
System.out.println("You have deposit "+bal+" \nyour total balance is "+amt );
}
void interest()
{
double i,cal;
System.out.println("Enter the Rate of Intrest");
i=sc1.nextInt();
cal=amt*(i/100);
System.out.println("Intrest amount is " +cal);
amt=cal+amt;
System.out.println("Total Balance in A/C is " +amt);
}
}
class current extends saving
{
void withdraw()
{
double bal;
System.out.println("Enter the amount to withdraw");
bal=sc1.nextInt();
amt=amt-bal;
System.out.println("You withdraw "+bal+" from your A/C \nyour remaining balance is "+amt );
}
void display()
{
System.out.println("\nDetails are :- ....");
System.out.println("name of the depositor is "+name);
System.out.println("Your total balance is "+amt );
}
} 
class bank2
{
public static void main(String args[])
{
current b=new current();
b.getdata();
b.deposit();
b.interest();
b.withdraw();
b.display();
}
}