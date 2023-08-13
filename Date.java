import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        int numDays = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Month: ");
        int month = in.nextInt();
        System.out.print("Enter a Year: ");
        int year = in.nextInt();
        
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
        }
        
        System.out.println("Maximum number of days: " + numDays);

        in.close();
    }
}

