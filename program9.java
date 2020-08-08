import java.util.*;
public class program9 {
    public static void main(String[] args) {
        String temp;
        int i,j;
       Scanner sc1=new Scanner(System.in);
       String[] names=new String[10];
       System.out.println("Enter the names of Student");
       for(i=0;i<5;i++)
         names[i]=sc1.nextLine();
         for(i=0;i<5; i++)
        {
            for(j=1;j<5; j++)
            {
                if(names[j-1].compareTo(names[j])>0)
                {
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                }
            }
        }
         System.out.println("Name of the Students in sorted array is ");
        for(i=0;i<5;i++)
            System.out.println(names[i]);
    }
    
}
