
import java.util.*;
public class ArmstrongNumber {
    public static void main(String args[]) {
        // ArmstrongNumber:  
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your Number:");
        int num=sc.nextInt();
        
        // int num=67; 
        int t=num;
        int sum=0;
        while(num>0)
        {
            int r=num%10;
            int square=(int)Math.pow(r, 3);
            sum=sum+square;
            num=num/10;
        }

        if(t==sum)
        {
            System.out.println("this number is armstrong number");
        }
        else{
            System.out.println("not armstrogn");
        }

    }
}
