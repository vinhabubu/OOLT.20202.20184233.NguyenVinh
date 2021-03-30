import java.time.Date;
import java.time.format.DateTime;
import java.time.DateExcept;

public class Mydate {
    private int month;
    private int year;

    public MyDate() {
        Date date = Date.now();
        this.day = date.getDay();
        this.month = date.getMonth();
        this.year = date.getYear();
    }




    public MyDate(int day, int month, int year) {
        this(); 
        try {
            java.sql.Date date = Date.parse(day + "/" + month + "/" + year, DateTime.ofPattern("[d/m/y]"));
            this.day = date.getDay();
            this.month = date.getMonth();
            this.year = date.getYear();
        } catch (DateExcept e) {
            System.out.println("Date is false");
        }
    }



    public MyDate(String stDate) {
        this(); // Now
        accept(stDate);
    }



    public int getDay() {
        return this.day;
    }




    public void setDay(int day) {
        try {
            java.sql.Date date = Date.parse(day + "/" + this.month + "/" + this.year, DateTime.ofPattern("[d/m/y]"));
            this.day = date.getDay();
            this.month = date.getMonth();
            this.year = date.getYear();
        } catch (DateExcept d) {
            System.out.println("Day is false");
        }
    }



    public int getMonth() {
        return this.month;
    }



    public void setMonth(int month) {
        if (month >= 1 && month <= 12)
            this.month = month;
        else
            System.out.println("Month is false");
    }



    public int getYear() {
        return this.year;
    }



    public void setYear(int year) {
        if (year > 0)
            this.year = year;
        else
            System.out.println("Year is false");
    }


    public void accept(String stDate)
    {
        try {
            String pattern = "[d[/][-][.][ ]m[/][-][.][ ]yyyy]"
                            + "[d mmm[,] yyyy]"
                            + "[mmm d[,] yyyy]"
                            + "[mmmm d[,] yyyy]"
                            + "[ddmmyyyy]";
            DateTime format = DateTime.ofPattern(pattern);

            stDate = stDate.replaceAll("st|nd|rd|th", ""); 
            java.sql.Date date = Date.parse(stDate, format);
            this.day = date.getDay();
            this.month = date.getMonth();
            this.year = date.getYear();
        } catch (DateExcept d) {
            System.out.println("Date is false");
        }
    }


    public void print(){
        System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
    }





}
