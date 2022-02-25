///PrimeNumber: which is divisible by 1 and itself;

public class PrimeNumber {
    public static void main(String[] args) {
    
        int count=0;
        for(int num=2;num<100;num++)
        {
            
        int i;
        for( i=2;i<num;i++)
        {   
            if(num%i==0)
            {
                // System.out.println("not a prime Number");
                break;
            }
        }
        
        if(i==num)
        {
            count++;
            System.out.println("prime number");
        }
        
       
       
    }
     System.out.println(count);
    
    }
}
