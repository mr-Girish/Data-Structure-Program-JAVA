class LeapYearOrNot{
    public static void main(String[] args) {
        int year=2400;
    //     if(year%4==0)  // if the year is % by 4 so 
    //     {
    //         if(year%100==0) //again we will check fr 100
    //         {
    //             if(year%400==0) // again we will check for 400
    //             {
    //                 System.out.println("leap year"); // whole three condition is satisfied so leap year
    //             }
    //             else
    //             {
    //                 System.out.println("not leap year");
    //             }
    //         }
    //         else{
    //             System.out.println("leap year");
    //         }
    //     }
    //     else{
    //         System.out.println("not a leap year");
    //     }
    // }

        //by AND operator
    if((year%400==0) ||( year%100!=0 && year%4==0)) // it will check all there condition in one line
    {
        System.out.println("leap year");
    }
    else{
        System.out.println("not leap year");
    }
}
}