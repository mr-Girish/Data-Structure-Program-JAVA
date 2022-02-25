// plandrome Number: the reverse of a number is equal of that original number \
// 1221=1221
public class PlandromeNumber
 {
   public static void main(String[] args) 
   {
    int num=1221;
    int temp=num; //we have to copy original number because it will destroy after number system
    int sum=0;
    while(num>0)
    {
       int  r=num%10;  //find the last digit of orinal number 1
        sum=sum*10+r; //create a number system to reach number 
       num=num/10; ///now you have to short the number 5
    }
    System.out.println(sum);
    if(temp==sum)
    {
        System.out.println("this is plandrome number");
    }
    else{
        System.out.println("not plandrome number");
    }
   }
}
