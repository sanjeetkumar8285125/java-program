import java.util.*;
public class program1 
{
    public static void main(String[] args)
    {
    Scanner sc1=new Scanner(System.in);
    int i,max,min,n;
    System.out.println("Enter the Size of  an array");
    n=sc1.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the Elements");
    for(i=0;i<n;i++)
    arr[i]=sc1.nextInt();  
    max=arr[0];
    min=arr[0];
 for(i=0;i<n;i++)
 {
     max=(arr[i]>max)?arr[i]:max;
     min=(arr[i]<min)?arr[i]:min;
 }
    System.out.println("Largest Number is "+max);
    System.out.println("Minimum Number is "+min);
    }
    
}
