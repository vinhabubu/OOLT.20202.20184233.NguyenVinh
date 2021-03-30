import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args){
        System.out.println("Vui long nhap vao gia tri cua a va b");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double tong = a+b;
        double hieu = a-b;
        double tich = a*b;
        double thuong = a/b;
        System.out.println("tong a va b la "+tong);
        System.out.println("hieu a va b la "+hieu);
        System.out.println("tich a va b la "+tich);
        System.out.println("thuong a va b la "+thuong);


    }

}
