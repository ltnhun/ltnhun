package s2;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean check = true;
//        while (check) {
//            System.out.println("n:= ");
//            int n = scanner.nextInt();
//            if (n>1 && n<99){
//                System.out.println("đúng rồi");
//                check = false;
//            } else {
//                System.out.println("Mời nhập lại");
//            }
//        }

       /// cách 2 :
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số n:");
        int n= scanner.nextInt();
        while (n<1 || n>99 ){
            System.out.println("Mời nhập lại:");
            n= scanner.nextInt();
        }
        System.out.println("Bạn đã nhập đúng số n !!!!!");


    }
}



//        Scanner scanner = new Scanner(System.in);
//        int n= scanner.nextInt();
//        while (n<1 || n >99 ){
//            System.out.println("Mời nhập lại");
//            n= scanner.nextInt();
//
//        }
//        System.out.println("Bạn đã điền đúng rồi ");






