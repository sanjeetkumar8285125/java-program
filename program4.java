import java.util.*;
public class program4 {
    public static void main(String[] args) {
        int num;
        List<Integer> arr = new ArrayList<Integer>();
        for(num=100;num<1000;num++)
       {
           if(test(num))
           {
              arr.add(num);
            }
       }
           System.out.println("Smallest three digit no is "+Collections.min(arr));
           System.out.println("Largest three digit no is "+Collections.max(arr));
           
    }
     
           public static boolean test(int num)
           {
           int sum=0,prod=1,n;
           while(num>0)
           {
           n=num%10;
           sum=sum+n;
           prod=prod*n;
           num=num/10;
           }
           return sum==prod;
    }
}
 
