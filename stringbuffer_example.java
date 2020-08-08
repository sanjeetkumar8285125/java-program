import java.util.*;
class stringbuffer_example
{
public static void main(String args[])
{
StringBuffer sb=new StringBuffer("HELLO");
sb.append("JAVA");
System.out.println(sb);
StringBuffer sb1=new StringBuffer("HELLO");
sb1.insert(1,"JAVA");
System.out.println(sb1);
StringBuffer sb2=new StringBuffer("HELLO");
sb2.replace(1,3,"ABC");
System.out.println(sb2);
StringBuffer sb3=new StringBuffer("JAVA");
sb3.delete(1,3);
System.out.println(sb3);
StringBuffer sb4=new StringBuffer("HELLO");
sb4.reverse();
System.out.println(sb4);
}
}