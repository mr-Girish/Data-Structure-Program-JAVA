public class LeftPascalTrangle {
    public static void main(String[] args) {

        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                    System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=n-i;k>0;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
