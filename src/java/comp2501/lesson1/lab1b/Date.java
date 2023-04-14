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

    public void updateYear(int newYear){
        this.year = newYear;
    }

    public void updateMonth(int newMonth){
        this.month = newMonth;
    }

    public void updateDay(int newDay){
        this.day = newDay;
    }

    public int returnYear(){
        return this.year;
    }

    public int returnMonth(){
        return this.month;
    }

    public int returnDay(){
        return this.day;
    }

    public String getYyMmDd(){
        return (year + "-" + month + "-" + day);
    }
}
