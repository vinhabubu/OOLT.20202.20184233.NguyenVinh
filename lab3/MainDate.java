public class MainDate {
    public static void main(String[] args) {
    MyDate new_date = new MyDate();



        new_date = new MyDate(20, 11, 2000);
        new_date = new MyDate("20/11/2000");
        new_date = new MyDate("20-11-2000");
        new_date = new MyDate("10.8.1999");
        new_date = new MyDate("15 3 2020");
        new_date = new MyDate("9 Mar 2000");
        new_date = new MyDate("16102007");
        new_date = new MyDate("November 19, 2006");
        new_date = new MyDate("23 Mar, 2000");


        new_date.accept("24/4/1978");
        new_date.accept("26.12.2021");


        new_date.print();
    
}
