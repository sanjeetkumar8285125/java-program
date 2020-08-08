import java.util.*;
public class program6 {
    public static void main(String[] args) {
Scanner sc1=new Scanner(System.in);
int num,days,months;
System.out.println("Enter the Days");
num=sc1.nextInt();
days=num%30;
months=num/30;
System.out.println(num+" days= "+months+" months & "+days+" days");
    }
    
}
