# NextDate-Test-Case-Design-
![Next1](https://github.com/AkshatKapo/NextDate-Test-Case-Design-/assets/94620098/81317182-4196-4d4f-81ea-f2c8adcb5417)

![Next2](https://github.com/AkshatKapo/NextDate-Test-Case-Design-/assets/94620098/d500f616-a55b-45d1-98a0-85aca922f9bf)

The screenshot above shows the import statements that were used for the JUnit test and test case 1, which tests the invalid month. In this test, we put the year out of the range, so this test case uses the assertEquals statement to check if the function prints out “ïnvalid.” So, when the invalid month is entered into the function, it returns invalid, out of range 


![Next3](https://github.com/AkshatKapo/NextDate-Test-Case-Design-/assets/94620098/4eeb58a6-772b-489d-9578-b1615b790658)

The above screenshot shows test cases 2 and 3. Test case 2 (TestNextDate2) tests if the NextDate function returns the correct output. When the date is put, the assertEqualts checks if the function returns the date of the next day that the user put.

Test case 3(TestNextDate) tests that the function works with the year, which is not a leap year. The NextDate function should return “2018-03-01” because 2018 is not a leap year, and assertEquals check this condition when the user enters 2018-02-28.


![next4](https://github.com/AkshatKapo/NextDate-Test-Case-Design-/assets/94620098/61515662-e774-440e-afd8-2eab014d6a43)

The test case4( testNextDate4) checks if the NextDate function returns the correct date if we enter a date within a leap year. So in this test case, we enter “2024-2-29,” and 2024 is a leap year, and the function should return “2024-03-01”, the next day's date. The assertEquals checks this condition.


Note that the assertEquals statement checks if the expected output that the user entered is the same as the actual value that the function returns when the arguments are entered into the function.

<h1> Test Outcomes </h1>

![testoutcomes](https://github.com/AkshatKapo/NextDate-Test-Case-Design-/assets/94620098/78f11976-243f-4490-9813-c2200682e018)

<h1> Next Date Code </h1>

![nextdate1](https://github.com/AkshatKapo/NextDate-Test-Case-Design-/assets/94620098/b10a167f-dd61-44cf-81f9-68262e2c5583)
![nextdate2](https://github.com/AkshatKapo/NextDate-Test-Case-Design-/assets/94620098/87e1d4f4-4bbe-494f-858c-d477660e0321)

The above Screenshot shows the NextDate class that calculates the next day's date. It uses the LocalDate function to calculate the date of the next day, and the data is stored in the tomorrow variable, which is then converted into a string, and if the year is in the range, it prints the date of the next day. If the year entered by the user is out of range, it prints the “Invalid Input, the year you put is out of the range.”It takes three arguments (year, month, and day).In addition, it also checks if the year entered by the user is a leap year or not and if the values that the user enters (year, month, Day) are in the range.

<h1> Code Output </h1>


![codeoutput](https://github.com/AkshatKapo/NextDate-Test-Case-Design-/assets/94620098/2f706574-9580-43c4-8a7d-7d3cfc74fdfe)





