
import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
        float num;
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the Number");
        num=sc1.nextFloat();
        System.out.println("Smallest Integer not less than the number is "+Math.ceil(num));
	System.out.println("Given Number : "+num);
	System.out.println("Largest Integer not greater than the number is "+Math.floor(num));
    }
}
