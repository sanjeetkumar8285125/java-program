 import java.util.*;
public class program10 {

    public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
        String str1,r,str2;
        System.out.println("Enter the First String");
        str1=sc1.nextLine();
        r=reverse(str1);
         System.out.println("Reverse of the string: " + r);
         palindrome(str1,r);
      System.out.println("Enter the second String");
      str2=sc1.nextLine();
      substring(str1,str2);
       System.out.println("After Concatenate String is "+concatenation(str1,str2));
        compare(str1,str2);
        array_characters(str1);
         sort_characters(str1);
        frequency(str1);
    }
      public static  String reverse(String str1)
        {
            String rev="";
         int length = str1.length();
      for (int i = length - 1 ; i >= 0 ; i--)
         rev = rev + str1.charAt(i);
     return rev;
    }
      public static void palindrome(String str1,String rev) 
      {
          if(str1.equals(rev))
          System.out.println("String "+str1+" is palindrome");
      else
          System.out.println("String "+str1+" is not palindrome");
      }
      public static String concatenation(String str1,String str2)
      {
      return str1+str2;
      }
      public static void compare(String str1,String str2)
      {
          int i,flag=1,len1,len2;
           len1=str1.length();
           len2=str2.length();
 
 char arr1[] = str1.toCharArray();
 char arr2[] = str2.toCharArray();
 
    if(len1==len2)
 { 
     for(i=0;i<len1;i++)
     {
         if(arr1[i]!=arr2[i])
         {
             flag=0;
                  break;
        }
     }
 }
 else
     {
     flag=0; 
   }
     	if(flag==1)
     {
         	System.out.println("The two string are EQUAL!!!");
         System.out.println(str1+" = "+str2);
     }
 
     else
     {
         	System.out.println("The two string are NOT EQUAL!!!");
         System.out.println(str1+" != "+str2);
     }
      }
      public static void substring(String str1,String str2)
      {
        char c,d;
        boolean match = true;
        for (int i = 0; i < str1.length(); i++) {
            c = str1.charAt(i);
            for (int j = 0; j < str2.length(); j++) {
                d = str2.charAt(j);
                if (c != d) {
                    match = false;
                } 
                else {
                    match = true;
                }   
            }
        }
     if (match==true)
            System.out.println("The first string is a substring of the second.");
     else 
     System.out.println("The first string is NOT a substring of the second.");
      }
      public static void array_characters(String str1)
      {
   char[] arr=new char[str1.length()];
          System.out.print("Character array is : ");
   for (int i=0;i<str1.length();i++)
   {
       arr[i]=str1.charAt(i);
       System.out.print(arr[i]);
   }
   System.out.println();
     }
    public static void sort_characters(String str1)
      {
       char temp = 0;
    char arr[] = str1.toCharArray();
    for (int i = 0; i < arr.length; i++)
    {
      for (int j = 0; j < arr.length; j++)
      {  
        if (arr[j] > arr[i])
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
      }
    }
    System.out.print("After Sorting characters in a string "+str1+" is : ");
    for (int i = 0; i < arr.length; i++)
    {
      System.out.print(arr[i]);
    }
System.out.println();
   }
public static void frequency(String str1)
{ 
        int[] count = new int[256]; 
        int i,c=0; 
        for (i=0; i< str1.length(); i++) 
            (count[str1.charAt(i)])++;  
        int first = 0, second = 0; 
        for (i = 0; i < 256; i++) 
        { 
            if (count[i] > count[first]) 
            { 
                second = first; 
                first = i; 
            } 
            else if (count[i] > count[second] && 
                     count[i] != count[first])
            {
                second = i;
            }
        } 
         System.out.println("Second most frequent char"+ 
                                       " is " + (char)second);
}

} 
