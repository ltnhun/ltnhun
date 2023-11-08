package BT;

import java.util.Scanner;

public class BTbuoi1 {
    public static void main (String[] args){
//        System.out.println("Enter your name :");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("Hello " + name);
        Scanner sc = new Scanner(System.in);
//        double weight,height,bmi;
//        System.out.println("Enter your weigh");
//        weight = sc.nextDouble();
//        System.out.println("Enter your heigh");
//        height = sc.nextDouble();
//        bmi = weight / Math.pow(height,2);
//        System.out.println("YOUR WEIGHT: " + weight);
//        System.out.println("YOUR WEIGHT: " + height);
        double vnd = 23000;
        double usd ;
        System.out.println("Mời bạn nhập số tiền USD :");
        usd = sc.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Số tiền là:" + quydoi);
    }
}
