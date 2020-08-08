
import java.util.Scanner;
public class program7 {
    public static void main(String[] args) {
        int num,rem,n,arm = 0;
  Scanner sc1=new Scanner(System.in);      
System.out.println("Enter the Number");
num=sc1.nextInt();
n=num;
while(num!=0)
{
    rem=num%10;
    arm=arm+(int)Math.pow(rem,3);
    num=num/10;
}
if(n==arm)
    System.out.println(n+" is an armstrong number");
else
    System.out.println(n+" is not an armstrong number");
  }
}
