import java.util.Scanner;

public class Phuongtrinhbac2 {
    public static void main(String[] args){

        System.out.println("Vui long nhap vao gia tri a,b,c");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        if ( a==0){
            System.out.println("Phuong trinh co nghiem la 0" + (-c/b));
        }
        else {
            double delta = b * b -4 * a * c;
            if (delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            }else if (delta ==0){
                double x = -b/2*a;
                System.out.println("Phuong trinh co nghiem la " +x);
            }else {
                double x1 = (-b -Math.sqrt(delta))/2*a;
                double x2 = (-b +Math.sqrt(delta))/2*a;
                System.out.println("Nghiem x1 la " + x1);
                System.out.println("Nghiem x2 la " + x2);
            }

        }
    }

}
