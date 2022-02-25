import java.util.*;
public class SpiralPrinting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row:");
        int row=sc.nextInt();
        System.out.println("Enter the coloumn :");
        int col=sc.nextInt();

        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("your main arrya is:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Spiral Printing:");
        int n=0,m=0;
        while(n<col && m<row)
        {
        for(int j=m;j<col;j++)
        {
          
            System.out.print(arr[m][j]+" ");
        }
        m++;
        for(int j=m;j<row;j++)
        {
            int i=col-1;
            System.out.print(arr[j][i]+" "+m);
        }

        for(int j=col-2;j>=n;j--)
        {
            int i=row-1;
            System.out.print(arr[i][j]+" "+m);
        }

        for(int j=row-2;j>n;j--)
        {
            
            System.out.print(arr[j][n]+" "+m);
        }
        n++;
        col--;
        row--;
    }
        
    }
}
