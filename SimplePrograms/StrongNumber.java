/// Strong number: sum of alll digit's factorial of that number: 145=1!+4!+5!=145 
public class StrongNumber
 {
    public static void main(String[] args)
     {
            int num=145;
            int temp=num; // we have to copy main numbber in any varible so what we can use next time this number 
            int sum=0;
            while(num>0)
            {
                int r=num%10;
                int f=1;
                for(int i=r;i>0;i--)
                {
                    f=f*i;
                }
                num=num/10;
                sum=sum+f;    
            }
            System.out.println("sum of the numer "+sum);
            if(sum==temp)
            {
                System.out.println("the number is Strong");
            }
            else
            {
                System.out.println("Not strong number");
            }
            
    }
}
