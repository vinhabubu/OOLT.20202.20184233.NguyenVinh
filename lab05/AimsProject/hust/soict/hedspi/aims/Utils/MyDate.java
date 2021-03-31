package hust.soict.hedspi.aims.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;
import java.util.HashMap;
import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;

    
    private static HashMap<String,Integer> s_map_i = new HashMap<String,Integer>(); 
    private static HashMap<Integer,String> i_map_s = new HashMap<Integer,String>();
    
    static{
    
        String[] str_day = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirdteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth",
        "nineteenth", "twenty", "twenty-first", "twenty-second", "twenty-third", "twenty-fourth", "twenty-fifth",
        "twenty-sixth", "twenty-seventh", "twenty-eighth", "twenty-ninth", "thirty", "thirty-first"};

        String[] str_month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", 
        "October", "November", "December"};

        String[] str_year = {"twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six",
        "twenty-seven", "twenty-eight", "twenty-nine","thirty","thirty-one","thirty-two","thirty-three","thirty-four",
        "thirty-five","thirty_six","thirty-seven","thirty-eight","thirty-nine"};

        for(int i = 0 ; i < 31 ; i++)
        {
            s_map_i.put(str_day[i].toLowerCase(), i+1); 
        }

        for(int i = 0 ; i < 12 ; i++)
        {
            s_map_i.put(str_month[i].toLowerCase(), i+1);
            i_map_s.put(i+1, str_month[i]); 
        }

        for(int i = 0 ; i < str_year.length ; i++)
        {
            s_map_i.put(str_year[i].toLowerCase(), i+21);
        }

    }

    public MyDate(){
        LocalDate now = LocalDate.now();
        this.day = now.getDayOfMonth();
        this.month = now.getMonthValue();
        this.year = now.getYear();
    }

   

    public MyDate(String day, String month, String year){
        try{
            int intDay = s_map_i.get(day.toLowerCase()); 
            int intMonth = s_map_i.get(month.toLowerCase());
            String[] split_year = year.split(" "); 
            String strYear = s_map_i.get(split_year[0]).toString() + s_map_i.get(split_year[1]).toString();
            int intYear = Integer.parseInt(strYear);

            System.out.println("" + intDay + "_" + intMonth + "_" + intYear);
            LocalDate date = LocalDate.parse(intDay + "/" + intMonth + "/" + intYear, DateTimeFormatter.ofPattern("d/M/yyyy")); // neu nhap sai dua ve ngay mac dinh
            this.day = date.getDayOfMonth();
            this.month = date.getMonthValue();
            this.year = date.getYear();
        }
        catch(Exception e){
            System.out.println("Error!");
            this.day = 01;
            this.month = 06;
            this.year = 2012;
        }
    }
    
    public MyDate(int day, int month, int year ){
        try {
            LocalDate now = LocalDate.parse(day + "/" + month + "/" + year, DateTimeFormatter.ofPattern("d/M/yyyy"));
            this.day = now.getDayOfMonth();
            this.month = now.getMonthValue();
            this.year = now.getYear();
            } catch (Exception e) {
            System.out.println("Error!");
            this.day = 01;
            this.month = 06;
            this.year = 2012;
        }
    }









    public MyDate(String strDate){
        accept(strDate);
    }

    public int getDay() {
        return this.day;
    }

    

    public void setDay(int day) {
        try {
            LocalDate date = LocalDate.parse(day + "/" + this.month + "/" + this.year, DateTimeFormatter.ofPattern("[d/m/y]"));
            this.day = date.getDayOfMonth();
            this.month = date.getMonthValue();
            this.year = date.getYear();
        } catch (DateTimeException e) {
            System.out.println("Day is wrong");
        }
    }




    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <=12)
        {
            this.month = month;
        }
        else
        {
            System.out.println("Month is wrong!");
        }
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if(year > 0 )
        {
            this.year = year;
        }
        else
        {
            System.out.println("Year is wrong!");
        }
    }

    public void accept() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" The date is :" );
        String strDate = keyboard.nextLine();
        accept(strDate);
        }

    public void accept(String strDate) {
        
        try {
            String date = "[d[-][/][.][ ]M[-][/][.][ ]yyyy]"; 
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(date);
            LocalDate now = LocalDate.parse(strDate, formatter);
            this.day = now.getDayOfMonth();
            this.month = now.getMonthValue();
            this.year = now.getYear();
        } catch (Exception e) {
            System.out.println("Error!");
            this.day = 01;
            this.month = 11;
            this.year = 2012;
        }
    }
    

    public void print() {
        String output = i_map_s.get(month) + " " + day;
        switch(day)
        {
            case 1:
            output += "st"; 
            break;
            case 2:
            output += "nd"; 
            break;
            case 3:
            output += "rd"; 
            break;
            default:
            output += "th";
            break;
        }
        output += " " + year; 
        System.out.println("Date : " + output);
    }



    public void print_int() {
        System.out.println("" + this.day + "-" + this.month + "-" + this.year);
    }
    
    
}
