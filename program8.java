
public class program8 {

    public static void main(String[] args) {
        for (int i=0;i<= 6;i++)
        {
            int alphabet = 65;
            for (int j=0;j<= 6-i;j++)
            {
                System.out.print((char)(alphabet + j));
            }
            for (int k=6-i;k>=0;k--)
            {
                System.out.print((char)(alphabet + k));
            }
            System.out.println();
        }
    }
}
    
