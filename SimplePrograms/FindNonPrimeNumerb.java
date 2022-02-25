public class FindNonPrimeNumerb {
    public static void main(String[] args) {
        int num=39343;
        while(num>0)
        {
            int digit=num%10;
            for(int i=2;i<digit;i++)
            {
                if(digit%i==0)
                {
                    System.out.println("not a prime numerb:"+digit);
                }
            }
            num=num/10;

        }
    }
}
