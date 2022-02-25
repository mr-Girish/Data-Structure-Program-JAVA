import java.util.Scanner;

public class kaprekarOrNot {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total number:");
        int size=sc.nextInt();
        System.out.println("entner your number");
        int num=0;
        int flag=0;
        for(int i=0;i<size;i++)
        {
             num=sc.nextInt();
        
        int t=num;
        int count=0;
        while(t>0)
        {
                count++;
                t=t/10;
        }
        int sqr=num*num;
        int sq=sqr;
        int countt=0;
        while(sq>0)
        {
            countt++;
            sq=sq/10;
        }
        // System.out.println("the square is:"+sqr);
        if(countt%2==0)
        {
            // System.out.println(sqr);
            int lastPart=sqr%(int)Math.pow(10,countt/2);
            int firstPart=sqr/(int)Math.pow(10,countt/2);
            int sum=lastPart+firstPart;
            // System.out.println(sum);
            if(sum==num)
            {
                flag=1;
                // System.out.println("the number is karekar");
            }
            else{
                flag=0;
                // System.out.println("not a kaprekar number");
            }

        }
        else{
                int LastTwo=sqr%(int)Math.pow(10,countt/2); // last two digit
                int firstone=sqr/(int)Math.pow(10,countt/2);  // first three
                
                int lastThree=sqr%(int)Math.pow(10,countt/2+1);  // last three
                int firsttwo=sqr/(int)Math.pow(10,countt/2+1); // first two

                int sum1=LastTwo+firstone;
                int sum2=lastThree+firsttwo;
                // System.out.println("sum of firt:"+sum1+"and last two"+sum2);
                if(sum1==num || sum2==num)
                {
                    flag=1;
                    // System.out.println("kaprekar");
                }
                else{
                    flag=0;
                    // System.out.println("not kaprekar");
                }
        }
        if(flag==1)
    {
        System.out.println("1");
    }
    else{
        System.out.println("0");
    }
    }
    
    
        
    }
}
