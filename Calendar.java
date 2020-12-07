package assignment6;
/**
 *
 * @author David A-T
 * 
 */
public class Calendar {
    // Data Members
    private int year;
    private int month;
    private int day;
    
    // Default Constructor
    public Calendar(){
        this.year = 2020;
        this.month = 1;
        this.day = 1;
    }
    
    // Constructor with year, month, day
    public Calendar(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    // Copy Constructor
    public Calendar(Calendar calendar){
        this.year = calendar.year;
        this.month = calendar.month;
        this.day = calendar.day;
    }
    
    /**
     * To increase the day in the calendar
     * (If it is the last day of the month, increase month and day equals 0)
     */
    public void increaseDay(){
        if (this.day < getDaysInMonth())
            this.day++;
        else {
            this.day = 1;
            increaseMonth();
        }
    }
    
    /**
     * To increase the month in the calendar
     * (If it is the last month of the year, increase year and month equals 0)
     */
    public void increaseMonth(){
        if (this.month < 12)
            this.month++;
        else {
            this.month = 1;
            increaseYear();
        }
    }
    
    /**
     * To increase the year in the calendar
     */
    public void increaseYear(){
        this.year++;
    }
    
    /**
     * To check if the current year is a leap year or not
     * @return true or false, based on if it is a leap year or not
     */
    public boolean isLeapYear(){
        if (this.year % 4 != 0)
            return false;
        else if (this.year % 100 != 0)
            return true;
        else if (this.year % 400 != 0)
            return false;
        else
            return true;
    }
    
    /**
     * To get the days in the current month
     * @return the number of days in the current month
     */
    public int getDaysInMonth(){
        switch(this.month){
            case 1:
                return 31;
            case 2:
                if (isLeapYear())
                    return 29;
                else
                    return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            default:
                return 31;
        }
    }
    
    /**
     * To convert the calendar object into a String
     * @return the calendar converted into a String
     */
    @Override
    public String toString(){
        String str = "";
        
        str += String.format("%d/%d/%d", day, month, year);
        
        return str;
    }
    
    /**
     * To check if this calendar is equals to another calendar
     * @param calendar
     * @return true or false, based on if it is equals to another calendar or not
     */
    public boolean equals(Calendar calendar){
        return this.year == calendar.year && this.month == calendar.month &&
                this.day == calendar.day;
    }
    
    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }
}
