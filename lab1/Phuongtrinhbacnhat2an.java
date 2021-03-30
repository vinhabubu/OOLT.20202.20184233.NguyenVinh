import java.util.Scanner;

public class Phuongtrinhbacnhat2an {
    public static void main(String[] args){
        System.out.println("Vui long nhap vao gia tri cua a11,a12,b1");
        Scanner scan = new Scanner(System.in);
        double a11 = scan.nextDouble();
        double a12 = scan.nextDouble();
        double b1 = scan.nextDouble();
        System.out.println("Vui long nhap vao gia tri cua a21,a22,b2");
        Scanner scan1 = new Scanner(System.in);
        double a21 = scan1.nextDouble();
        double a22 = scan1.nextDouble();
        double b2 = scan1.nextDouble();
        double D = a11*a22 - a21*a12;
        double D1 = b1*a22 - b2*a12;
        double D2 = a11*b2 -a21*b1;
        if (D != 0){
            double x = D1/D;
            double y = D2/D;
            System.out.println("He phuong trinh co cap nghiem x la " + x +" ,y la " + y);
        }else {
            if ((D1 == 0) && (D2 == 0)){
                System.out.println("He phuong trinh vo so nghiem");
            }else{
                System.out.println("He phuong trinh vo nghiem");
            }
        }




    }

}
