import java.util.*;
class Salary
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your salary:");
        int salary=sc.nextInt();  
        if(salary>10000)
        {
            salary=salary+2000;
            System.out.println(salary);
        }  
        else
        {
            salary=salary+1000;
            System.out.println(salary);
        }
}
}