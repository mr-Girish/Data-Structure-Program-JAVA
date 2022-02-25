// in array if the sum of number is prime so print it
public class SumofdigitInArry {
    public static void main(String[] args) 
    {
        int arr[]={12,15,18,20,16};
        int arr1[]=new int[arr.length];
        int i;k=0;
        for( i=0;i<arr.length;i++)
        {
            int temp=arr[i];
            int sum=0;
            while(temp>0)
            {
               
                int digit=temp%10;
                   sum=sum+digit;
                temp=temp/10;
            }
            // System.out.println(sum+" ");
            int j;
            for( j=2;j<sum;j++)
            {   
                    if(sum%j==0)
                    {
                        // System.out.println("this is not prime:"+sum);
                        break;
                    }
            }
            if(sum==j)
            {
                arr1[k++]=arr[i];
                // k++;
                // System.out.println("this is prime"+sum);
            }
        }
        System.out.println("new array is:");

        for(int f=0;f<k;f++)
        {
            System.out.println(arr1[f]+" ");
        }
    }
}
