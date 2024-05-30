

import org.testng.annotations.Test; // import used for annotations

import static org.testng.Assert.*;// import used for assert

public class NextDateTest {


    @Test
    public void testNextDate1() {

        // test case that checks if the code gives invalid, if the user put month which is out of range.
        String message = "Invalid input,the year you put is out of range";

         // checks if the output is invalid, if the year put by the user is our of range.
        assertEquals(NextDate.NextDate(2214, 12, 13),message);
    }
    @Test
    public void testNextDate2() {
  // test same month

        String d = "2019-01-08";//  String to store the expected date
        assertEquals(NextDate.NextDate(2019,01,7), d);// assertEqual function to check if
        // the expected value is same as what function returns.
    }

    // test case 2 : it tests not leap year
    @Test
    public void testNextDate3() {

   // test not Leap Year
        String d = "2018-03-01";//String to store the expected date


        assertEquals(NextDate.NextDate(2018,02,28),d);// assertEqual function to check if
        // the expected value is same as what function returns.


    }
    // Test case 3: tests leap year
    @Test
    public void testNextDate4() {
        // Testing LeapYear

        String d = "2024-03-01"; // String to store the expected date


        assertEquals(NextDate.NextDate(2024,02,29),d);;// assertEqual function to check if
        // the expected value is same as what function returns.



    }
    @Test
    public void testNextDate5() {

        // Testing end of month

        String d = "2015-01-01";// String to store the expected date


        assertEquals(NextDate.NextDate(2014,12,31),d);// assertEqual function to check if
        // the expected value is same as what function returns.


    }
    @Test
    public void testNextDate6() {

        // Testing if the following year in leap year

        String d = "Invalid input, it's not a leap year";// String to store the expected date


        assertEquals(NextDate.NextDate(2022,02,29),d);// assertEqual function to check if
        // the expected value is same as what function returns.


    }










}







