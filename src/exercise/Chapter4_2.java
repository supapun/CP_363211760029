package exercise;

import java.util.Scanner;

public class Chapter4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //รับข้อมูล จำนวนเต็ม และจำนวนจริง สลับกัน สังเกตผลการทำงาน

        System.out.print("Enter integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter real number: ");
        double b = scanner.nextFloat();
        System.out.print("Enter integer: ");
        int c = scanner.nextInt();
        System.out.print("Enter real number: ");
        double d = scanner.nextFloat();
        System.out.print("Enter integer: ");
        int e = scanner.nextInt();
        //display
        System.out.println(a +" "+b+" "+c+" "+d+" "+e);

    }

}