public class FibboonacciiSeries {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int third=0;
        int num=10;
        System.out.print(first+" "+ second+" ");
        // while(num>0)
        for(int i=first;i<num;i++)
        {
            third=first+second;
            System.out.print(third+" ");
            first=second; 
            second=third;
        }
    }
}
