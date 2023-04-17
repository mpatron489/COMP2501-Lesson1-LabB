package comp2501.lesson1.lab1b;
public class Date {

    private int year;
    private int month;
    private int day;

    public Date(final int year, final int month, final int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int newYear){
        this.year = newYear;
    }

    public void setMonth(int newMonth){
        this.month = newMonth;
    }

    public void setDay(int newDay){
        this.day = newDay;
    }

    public int getYear(){
        return this.year;
    }

    public int getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
    }

    public String getYyMmDd(){
        return (year + "-" + month + "-" + day);
    }

}

