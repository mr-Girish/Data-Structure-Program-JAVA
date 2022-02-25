public class SwapfirstDigittoLastdigit {
    
    public static void main(String[] args) {
     int num=12345;
     int t=num;
     int x=num;
     int sum=0;
     int count=0;
     while(x>0)
     {
         count++;
         x=x/10;
     }

     int r=t%10;  // for  store the last digit
     sum=sum+r;
     t=t/10;  // short the number 

     int abc=(int)Math.pow(10, count-2);
     
     r=t%abc;
     System.out.println("t value is:"+r);
     sum=sum*abc+r;
     System.out.println("sum value is:"+sum);
     t=t/abc;
     System.out.println(t);
     sum=sum*10+t;
     System.err.println("last num"+sum);
     

    }
}
