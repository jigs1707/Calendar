import java.util.Scanner;

public class MyCalendar {

    //MyDate object to hold the values of the class
    private static MyDate myDate;

    //Main class
    public static void main(String[] args) {
        
        //Initialisation of a scanner
        Scanner sc = new Scanner(System.in);

        //Initialisation of a boolean in realtion to the date being valid or not
        boolean validDate = false;

        //Loop to allow user to input dates and show date information and calendar, while the boolean validDate is false
        while (!validDate) {

            System.out.print("Enter the date as day month year: ");
            MyDate enteredDate = new MyDate(sc.nextInt(), sc.nextInt(), sc.nextInt());

            if (enteredDate.isDateValid() == true) {
                MyCalendar myCalendar = new MyCalendar(enteredDate);
                myCalendar.printDateInfo();
                myCalendar.printCalendar();
                validDate = true;
            } else {
                System.out.println("Please enter a valid date");
            }

        }
    }

    //Method to calculate the zeller formula which calculates the day of the week
    public double zellerFormula(int day, int month, int year) {

        //Months Fanuary and February become the 13th and 14th month of the previous year, when user inputs them as 1 or 2 in realtion
        if (month > 0 && month < 3) {
            month = month + 12;
            year = year - 1;
        }

        int q = day;

        int m = month;

        int y = year;

        int k = y % 100;

        int j = y / 100;

        double h = (q + Math.floor((13 * (m + 1) / 5)) + k + Math.floor((k / 4)) + (j / 4) + (5 * j)) % 7;

        return h;

    }

    //Enum to hold the value of all the days
    public static enum Day {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    };

    //Enum to hold the value of all the months
    public static enum Month {
        January, February, March, April, May, June, July, August, September, October, November, December
    };

    //Constructor
    public MyCalendar(MyDate myDate) {
        this.myDate = myDate;
    }

    //Returns the dat of the week using the zeller formula
    public Day getDayOfWeek() {

        Day day = null;

        switch ((int) zellerFormula(myDate.getDay(), myDate.getMonth(), myDate.getYear())) {

            case 0:
                day = Day.Saturday;
                break;

            case 1:
                day = Day.Sunday;
                break;

            case 2:
                day = Day.Monday;
                break;

            case 3:
                day = Day.Tuesday;
                break;

            case 4:
                day = Day.Wednesday;
                break;

            case 5:
                day = Day.Thursday;
                break;

            case 6:
                day = Day.Friday;
                break;

        }
        return day;
    }

    //Returns back the week of the month the date is in
    public int getWeekOfMonth() {

        return myDate.getDay() / 7 + 1;
    }

    //Prints the week of the month to a String value
    public String printWeekOfMonth() {
        String w = null;
        switch ((int) getWeekOfMonth()) {
            case 1:
                w = "first";
                break;

            case 2:
                w = "second";
                break;

            case 3:
                w = "third";
                break;

            case 4:
                w = "fourth";
                break;

            case 5:
                w = "fifth";
                break;
        }
        return w;
    }

    //Prints the months to a String value
    public Month printMonth(int m) {
        
Month month = null;

//Months January and February become the 13th and 14th, when user inputs them as 1 or 2 in realtion
        if (m > 0 && m < 3) {
            m = m + 12;
        }
            

            switch (m) {
                case 3:
                    month = Month.March;
                    break;

                case 4:
                    month = Month.April;
                    break;

                case 5:
                    month = Month.May;
                    break;

                case 6:
                    month = Month.June;
                    break;

                case 7:
                    month = Month.July;
                    break;

                case 8:
                    month = Month.August;
                    break;

                case 9:
                    month = Month.September;
                    break;

                case 10:
                    month = Month.October;
                    break;

                case 11:
                    month = Month.November;
                    break;

                case 12:
                    month = Month.December;
                    break;

                case 13:
                    month = Month.January;
                    break;

                case 14:
                    month = Month.February;
                    break;
            }
        
        return month;
    }

    //Method to print the date information that the user inputs
    public void printDateInfo() {
        System.out.println(myDate.getDay() + "/" + myDate.getMonth() + "/" + myDate.getYear() + " is a " + getDayOfWeek() + " and located in the " + printWeekOfMonth() + " week of " + printMonth(myDate.getMonth()) + " " + myDate.getYear());
    
    }

    //Prints out the calendar of the month of that year the user has entered
    public void printCalendar()
    {
        System.out.println();
System.out.println("The calendar of " + printMonth(myDate.getMonth()) + " " + myDate.getYear() + " is: ");

switch(myDate.getMonth())
{
    
}

switch(myDate.getMonth())
{
    
}
    }

}









class MyDate {

    //Declaration of private variables
    private int day;
    private int month;
    private int year;

    //Constructor
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Returns back the value of variable day
    public int getDay() {
        return day;
    }

    //Returns back the value of variable month
    public int getMonth() {
        return month;
    }

    //Returns back the value of variable year
    public int getYear() {
        return year;
    }

    //Method checks whether the date that has been entered is valid or not
    public boolean isDateValid() {
      /* if (day >= 1 || day <= 31) {
            return true;
        } else if (month >= 3 || month <= 14) {
            return true;
        }

        return false;*/
      
      //Values of the months with 31 days
      switch(getMonth())
{
          case 1: 
          case 3:
          case 5:
          case 7:
          case 8:
          case 10:
          case 12:
          if (day >= 1 || day <= 31){
              return true;
          }
           break;             
}
      
    
      //Values of the months with 30 days
    switch(getMonth())
{
        case 4:
        case 6:
        case 9:
        case 11:
            if (day >= 1 || day <= 30){
                return true;
            }
            break;
            
    
}  
    
    //Value of February during leap year and non leap year
    if(isLeapYear(year) == true){
        if(getMonth() == 2){
           
        }
    }
      
      
      
      
      
      
      
      
      return false;
    }
      
      

    //Method to determine whether an year is Leap year or not
    public boolean isLeapYear(int year) {

        boolean isLeapYear = true;

        if (year % 4 != 0) {
            isLeapYear = false;
        } else if (year % 100 != 0) {
            isLeapYear = true;
        } else if (year % 400 != 0) {
            isLeapYear = false;
        } else {
            isLeapYear = true;
        }

        return isLeapYear;
    }
}