public class Duplicate {
        public static void main(String[] args) {
            int arr[]={1,2,3,2,3,4,5,6,6};
            int arr1[]={-1,-1,-1,-1,-1,-1,-1,-1,-1};

            for(int i=0;i<arr.length;i++)
            {
                int count=1;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                        arr[j]=0;
                    }
                }
                if(arr[i]!=0)
                {
                    arr1[i]=count;
                }
            }

            int temp[]=new int [arr.length];
            int k=0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]!=0)
                {
                    temp[k]=arr[i];
                    k++;
                }
            }
            for(int i=0;i<k;i++)
            {
                System.out.println(temp[i]);
            }
        }
}
