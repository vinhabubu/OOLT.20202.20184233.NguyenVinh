import java.util.Scanner;

public class Chuongtrinhngaythang {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String nhapthang;
        int nam;
        int thang = 0;

        System.out.print("nam: ");
        nam = scan.nextInt();

        System.out.print("thang: ");
        scan.nextLine();
        nhapthang = scan.nextLine();
        switch (nhapthang) {
            case "January":
            case "Jan.":
            case "Jan":
            case "1":
                thang = 1;
                break;
            case "February":
            case "Feb.":
            case "Feb":
            case "2":
                thang = 2;
                break;

            case "March":
            case "Mar.":
            case "Mar":
            case "3":
                thang = 3;
                break;

            case "April":
            case "Apr.":
            case "Apr":
            case "4":
                thang = 4;
                break;

            case "May":
            case "5":
                thang = 5;
                break;

            case "June":
            case "Jun":
            case "6":
                thang = 6;
                break;

            case "July":
            case "Jul":
            case "7":
                thang = 7;
                break;

            case "August":
            case "Aug.":
            case "Aug":
                thang = 8;
                break;

            case "September":
            case "Sept.":
            case "Sep":
            case "9":
                thang = 9;
                break;

            case "October":
            case "Oct.":
            case "Oct":
            case "10":
                thang = 10;
                break;

            case "November":
            case "Nov.":
            case "Nov":
            case "11":
                thang= 11;
                break;

            case "December":
            case "Dec.":
            case "Dec":
            case "12":
                thang = 12;
                break;

            default:
                System.out.println("Khong tim thay thang ban mong muon");
              scan.close();
                System.exit(0);
        }

        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.err.println("So ngay trong thang la 31");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("So ngay trong thang la 30");
                break;

            case 2:
                if (nam % 4 != 0)
                    System.out.println("So ngay trong thang la 28");
                else if (nam % 100 == 0 && nam % 400 == 0)
                    System.out.println("So ngay trong thang la 29");
                else
                    System.out.println("So ngay trong thang la 28");

            default:
                break;
        }

        scan.close();
        System.exit(0);
    }
}


