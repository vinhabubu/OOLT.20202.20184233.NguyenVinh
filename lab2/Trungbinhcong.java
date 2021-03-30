import java.util.Random;
import java.util.Scanner;

public class Trungbinhcong {
    public static void main(String[] args) {

        int a[] = new int[1000];
        for(int i = 0; i<1000;i++){
            a[i] = (int)( Math.random() *200 );

        }

        Scanner scan = new Scanner(System.in);

        System.out.println("nhap vao so phan tu cua mang ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        int total = 0;
        for(int i = 0; i< n; i++){
            Scanner b = new Scanner(System.in);
            String c = b.nextLine();
            if(c.equals("$")){
                arr[i] = a[i];
            }
            else{
                arr[i] = Integer.parseInt(c);
            }
        }
        for(int j=0; j<arr.length; j++){
            total = total + arr[j];
        }
        double average = total / arr.length;
        System.out.println("Tong la: " + total);
        System.out.format("Ket qua trung binh la: %.3f", average);
    }
}
