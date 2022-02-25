public class FindMaxMin {
    public static void main(String[] args) {
        int arr[]={13,21,33,41,533,63,833,-1};
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("min is::"+min+"Max is:"+max);

    }
}
