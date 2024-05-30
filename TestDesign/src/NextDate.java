import java.time.LocalDate;// use of Local library to get the date and coverts user input into date object.


public class NextDate {
    public static String  NextDate(int year, int month, int date) { // takes arguments that user inputs.

        if(date<1 && date>31 ){
            System.out.println("Date should be between 1 to 31");
        }

        if(month<1 && month>12){
            System.out.println("Month should be between 1 to 12");
        }

        String invalid="Invalid input,the year you put is out of range";
        // checks if the user input year is leap year or no
        if (month==2&&!LocalDate.ofYearDay(year, 1).isLeapYear() && date==29) {
            return "Invalid input, it's not a leap year";
        }


        // if condition to check if the year that user puts is in th range
        if (year >= 1812 &&  year <= 2212) {



            LocalDate Day = LocalDate.of(year, month, date); // use of LocalDate function to get the date of the current date that user put and it also converts
            // the integer that user puts into date
            LocalDate tomorrow = Day.plusDays(1);// adding plus 1 to the date that user puts to get the date of next day
            String d1= tomorrow.toString(); // converts LocalDate object (tommorow) to a string to return a string

            return d1;// if the year is in the range, it returns the date of the next day

        }






           else {
               return invalid;// if the year that user puts is out of range it return invalid output
        }


        }



        }










