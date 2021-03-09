import java.util.Scanner;

public class Cong2matrancungkichthuoc {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao so hang cua ma tran: ");
        a =scan.nextInt();
        System.out.println("Nhap vao so cot cua ma tran: ");
        b =scan.nextInt();

        int arr1[][] = new int[a][b];
        int arr2[][] = new int[a][b];
        int arr3[][] = new int[a][b];

        System.out.println("Nhap vao ma tran dau");
        for ( int i = 0 ; i < a ; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("arr1[" + i + "][" + j + "] = ");
                arr1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Nhap vao ma tran thu 2");
        for ( int e = 0 ; e < a ; e++)
        {
            for (int f = 0 ; f < b ; f++)
            {
                System.out.print("arr2[" + e + "][" + f + "] = ");
                arr2[e][f] = scan.nextInt();
            }
        }
        // cong 2 ma tran
        for (int i = 0 ; i < a ; i++)
        {
            for ( int j = 0 ; j < b ; j++)
            {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Ma tran dau :");
        for ( int i = 0 ; i < a ; i++)
        {
            for (int j = 0 ; j < b ; j++)
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Ma tran thu 2 : ");
        for ( int e = 0 ; e < a ; e++)
        {
            for (int f = 0 ; f < b ; f++)
            {
                System.out.print(arr2[e][f] + " ");
            }
            System.out.println();
        }
        System.out.println("Tong ca 2 la : ");
        for ( int i = 0 ; i < a ; i++)
        {
            for (int j = 0 ; j < b ; j++)
            {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        System.exit(0);




    }
}
