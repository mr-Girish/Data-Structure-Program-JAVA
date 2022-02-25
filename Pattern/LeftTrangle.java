public class LeftTrangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(' ');
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print('9');
            }
            for(int j=n-1-i;j>0;j--)
            {
                System.out.print("0");
            }
            System.out.println();
        }
       
       
    }
}
