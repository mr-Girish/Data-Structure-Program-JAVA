public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,28,3,4,5,6,70,8};
        int element=70;
        int i;
        for( i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                System.out.println("Foudn:");
                break;
            }
        }
        if(i==arr.length)
        {
            System.out.println("not found");
        }

    }
}
