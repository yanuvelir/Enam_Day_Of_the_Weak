import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        switch (dayOfTheWeak()){
            case MONDAY:
                System.out.println("Today is *Monday*, the first work day");
                break;
            case TUESDAY:
                System.out.println("Today is *Tuesday*, the second day of the work week.");
                break;
            case WEDNESDAY:
                System.out.println("Today is *Wednesday*, the first half of the work week is completed.");
                break;
            case THURSDAY:
                System.out.println("Today is *Thursday*, the second half of the work week is started.");
                break;
            case FRIDAY:
                System.out.println("Today is *Friday*, finally the last day of the work week.");
                break;
            case SATURDAY:
                System.out.println("Today is *Saturday*, Weekend is started.");
                break;
            case SUNDAY:
                System.out.println("Today is *Sunday*, the last day of the weekend.");
                break;
            default:
                System.out.println("Sorry, something went wrong. Please contact our support to resolve the problem.");
                break;
        }

    }

    public static Constant dayOfTheWeak(){
        LocalDate currentDate = LocalDate.now();
        DayOfWeek currentDayOfTheWeek = currentDate.getDayOfWeek();
        switch (currentDayOfTheWeek) {
            case MONDAY:
                return Constant.MONDAY;
            case TUESDAY:

                return Constant.TUESDAY;
            default:
                System.out.println(currentDayOfTheWeek);
                return Constant.UNRECOGNIZED;
        }
    }
}

//        // Get the current date
//        LocalDate currentDate = LocalDate.now();
//
//        // Get the day of the week from the current date
//        DayOfWeek currentDayOfWeek = currentDate.getDayOfWeek();
//
//        // Print the current day of the week
//        System.out.println("Today is " + currentDayOfWeek);