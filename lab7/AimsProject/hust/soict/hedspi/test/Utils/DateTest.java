package hust.soict.hedspi.test.utils;

import hust.soict.hedspi.aims.utils.*;

public class DateTest {
    public static void main(String[] args) {
         MyDate date = new MyDate();
         date = new MyDate(16, 06, 2020);
         date = new MyDate("15-02-2100");
         date = new MyDate("16/02/2020");
         date = new MyDate("15.03.2010");
         date = new MyDate("26 03 2000");
         
        date = new MyDate("first", "February", "twenty twenty-nine");
        date.print();
        MyDate date1 = new MyDate(1, 12, 2011);
        MyDate date2 = new MyDate(16, 12, 2013);
        System.out.println(DateUtils.compare(date1, date2));

        MyDate[] dates = new MyDate[3];
        dates[0] = new MyDate(13, 03, 2010);
        dates[1] = new MyDate(16, 03, 2020);
        dates[2] = new MyDate(19, 03, 2000);

         DateUtils.sort(dates);
         DateUtils.print_arr(dates);

    }
}
