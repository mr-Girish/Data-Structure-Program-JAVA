public class BinarySearch {
    public static void main(String[] args) {
        // in binary search element should be in  shorted  list
        int  arr[]={10,20,30,40,50,60,70};
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        int element=10;
        int flag=0;
        for(int i=start;i<=end;i++)
        {
            if(element==mid)
            {
                flag=2;
                System.out.println("found");
                break;
            }
             if(element>arr[mid])
            {
                start=mid+1;

            }
            else{
                end=mid-1;
            }
            mid=(start+end)/2;
        }
        if(flag==0)
        {
            System.out.println("not found");
        }
    }
}
