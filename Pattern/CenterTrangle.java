public class CenterTrangle {
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
            for(int m=0;m<=i;m++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
