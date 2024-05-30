import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanners to take inputs
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2= new Scanner(System.in);

        System.out.println("Enter the year:");//ask for the year
        int year = input.nextInt(); //takes year from the user


        System.out.println("Enter the month:");//ask for the month
        int month = input1.nextInt();//takes month from the user

        System.out.println("Enter date:");//ask for the date
        int date = input2.nextInt();//takes year from the user

          NextDate d = new NextDate();// creates NextDate object
            System.out.println(d.NextDate(year,month,date));// sends the output to the NextDate function in the NextDate class and prints out the output.











    }



}

