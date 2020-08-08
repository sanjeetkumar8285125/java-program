import java.util.*;
class account
{
String name;
int acno;
String type;
double amt;
Scanner sc1=new Scanner(System.in);
void getdata()
{
System.out.println("Enter the name of the Depositor");
name=sc1.next();
System.out.println("Enter the Account number");
acno=sc1.nextInt();
System.out.println("Enter the type of account");
type=sc1.next();
System.out.println("enter the balance amount in account");
amt=sc1.nextInt();
}
void transaction()
{
int x;
System.out.println("1.Deposit");
System.out.println("2.Withdraw");
System.out.println("Enter your choice");
x=sc1.nextInt();
switch(x)
{
case 1 :
deposit();
break;
case 2 :
withdraw();
break;
default:
System.out.println("invalid option");
}
}
void deposit()
{
double bal;
System.out.println("Enter the amount to deposit");
bal=sc1.nextInt();
amt=amt+bal;
System.out.println("You have deposit "+bal+" \nyour total balance is "+amt );
}
void withdraw()
{
double bal;
System.out.println("Enter the amount to withdraw");
bal=sc1.nextInt();
amt=amt-bal;
System.out.println("You have withdraw "+bal+" \nyour remaining balance is "+amt );
}
void display()
{
System.out.println("\nDetails are :- ....");
System.out.println("name of the depositor is "+name);
System.out.println("Your total balance is "+amt );
}
}
class bank
{
public static void main(String args[])
{
account a1=new account();
a1.getdata();
a1.transaction();
a1.display();
}
}