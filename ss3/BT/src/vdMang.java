package s2;

import java.util.Arrays;
import java.util.Scanner;

public class vdMang {
    public static void main(String[] args) {
//        double mang1[];
//        double mang2[];
//        mang1= new double[10];
//        Scanner scanner = new Scanner(System.in);
//        for (int i =0;i<mang1.length;i++){
//            System.out.println("Nhập phần tử thứ " + i);
//            mang1[i] = scanner.nextDouble();
//        }
//        double tong = 0;
//        for (int i=0;i<mang1.length;i++){
//            tong+=mang1[i];
//        }
//        System.out.println("Tổng bằng: " + tong);
//        double mang1[];
//        mang1 = new double[10];
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Nhập 10 phần tử: ");
//        for (int i=0;i<mang1.length;i++){
//            mang1[i] = scanner.nextDouble();
//        }
//        double tong = 0;
//        for (int j =0; j<mang1.length;j++){
//            tong = tong + mang1[j];
////        }
//        System.out.println("Tổng bằng : " + tong);
//        int [] mang2 = {1,2,3,4,5};
//        for (int i=0; i<mang2.length;i++){
//            System.out.println(mang2[i]);
//        }
         /// TẠO MẢNG CÓ N PHẦN TỬ, N NHẬP TỪ BÀN PHÍM, in ra các phần tử đó

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập phần tử tối đa của mảng:");
//        int n = scanner.nextInt();
//        int [] Mang = new int [n];
//        for (int i=0;i< n;i++){
//
//            Mang[i] = scanner.nextInt();
//        }
//        System.out.println("SL phần tử là : " + Mang.length);
        /// SẮP XẾP MẢNG ///
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập SL phần tử tối đa : ");
        int n = scanner.nextInt();
        int [] mang2 = new int [n];
        for (int i=0; i<n;i++){
            mang2[i]= scanner.nextInt();
        }
        Arrays.sort(mang2);
        System.out.println("Mảng sau khi sắp xếp là :" + Arrays.toString(mang2));

    }
}
