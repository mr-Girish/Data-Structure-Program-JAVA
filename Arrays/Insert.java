public class Insert {
    public static void main(String[] args) 
    {

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n=6;
        for (int i = 0; i < n; i++)
         {
            System.out.println(arr[i]);
        }
        int pos=2;
        int ele=222;
        for(int i=n-1;i>pos;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos]=ele;
        System.out.println("After insert new element the array is:");
        for (int i = 0; i < n; i++)
         {
            System.out.print(arr[i]+" ");
        }
    }

}
