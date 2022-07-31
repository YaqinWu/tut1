// Java program to check if the input year is a leap year or not
import java.util.Scanner; 
 
public class leapYear{
 
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                //year we want to check
                int year = s.nextInt();
               
                //if year is divisible by 4, it is a leap year
               
                if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                        System.out.println("Year " + year + " is a leap year");
                else
                        System.out.println("Year " + year + " is not a leap year");
				s.close();
        }
}
 
