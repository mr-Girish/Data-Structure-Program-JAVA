public class FindLCM {
    public static void main(String[] args) {
        int a=12, b=18;
        int big=a>b?a:b;
        for(int i=big;i<=a*b;i++)
        {
            if(i%a==0 && i%b==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
