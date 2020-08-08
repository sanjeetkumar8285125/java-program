import java.util.*;
public class program5 {
    public static void main(String[] args) {
        int num,sum=0,i;
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the Number");
        num=sc1.nextInt();
        for(i=1;i<num;i++)
        {
            if(num%i==0)
                sum=sum+i;
        }
        if(num<sum)
            System.out.println(num+" is an abundant Number");
        else if(num>sum)
            System.out.println(num+" is a deficient Number");
        else if(num==sum)
            System.out.println(num+"is a perfect Number");
            
    }
}
