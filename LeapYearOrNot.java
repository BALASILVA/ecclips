package fibonasis;
import java.util.Scanner;
public class LeapYearOrNot {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of days in year");
	int year=sc.nextInt();
	sc.close();
	if(year%4 == 0)
	{
        if( year%100 == 0)
        { 
            if(year%400==0)
            	System.out.println("The given year is leap year");
            }
            else
            	System.out.println("The given year is not leap year");
        }
            else
            	System.out.println("The given year is not leap year");

}
}