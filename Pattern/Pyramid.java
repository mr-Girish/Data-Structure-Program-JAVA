public class Pyramid{
    public static void main(String[] args) {
        int i;
        for( i=0;i<5;i++)
        {
           System.out.print("@");
        }
        for(int j=0;j<=i;j++)
        {
            System.out.println("*");
        }
        System.out.println();
    }
}