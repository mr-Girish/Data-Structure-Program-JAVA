//Automorphic number=> square of 25 number is 625 now (25 should be lst two digitof origianl numebr)

public class AutomorphicNum {
    
    public static void main(String[] args) {
        
        int num=4;
        int temp=num;
        int count=0;
        ///count the all diigit ni original number;
        while(temp>0)
        {
            count++;
            temp=temp/10;
        }

        int sqr=(int)Math.pow(num, 2);
        System.out.println(sqr);
        int digit=sqr% (int)Math.pow(10, count);
         System.out.println(digit);
         if(digit==num)
         {
             System.out.println("this Number is Automorphic");
         }
         else
         {
             System.out.println("Not a Automorphic:");
         }
    }
}
