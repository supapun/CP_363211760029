package exercise;

import java.util.Scanner;

// พื้นที่สามเหลี่ยม  = 0.5 * w* h
// พื้นที่วงกลม   = Pi * r * r * r
// พื้นที่ทรงกรวย = 1/3 * Pi * r * r * h
public class Exercise_Lab4_findArea {
    public static void main(String[] args) {
        // user select list menus 1-4
        Scanner sc = new Scanner(System.in);
        int select;
        boolean b = false;
        do {
            System.out.println("Please, select menu below: ");
            System.out.println("1. คำนวณพื้นที่สามเหลี่ยม");
            System.out.println("2. คำนวณพื้นที่วงกลม");
            System.out.println("3. คำนวณพื้นที่ทรงกรวย");
            System.out.println("4. ออกจากโปรแกรม");
            System.out.print("เลือก: ");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    findTriangleArea();
                    break;
                case 2:
                    findCircleArea();
                    break;
                case 3:
                    findConeArea();
                    break;
                case 4:
                    System.out.println("Good Bye.");
                    System.exit(1);
                    break;
                default:
                    b = true;
            }//switch
        } while (b);

    }//main

    private static void findCircleArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("รัศมีของวงกลม: ");
        double r = sc.nextDouble();
        double area = 3.141 * r * r * r;
        System.out.println("พื้นที่วงกลม = "+area);
    }

    private static void findConeArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("รัศมีของทรงกรวย: ");
        double r = sc.nextDouble();
        System.out.print("ความสูงของทรงกรวย: ");
        double h = sc.nextDouble();
        double area = (1.0 / 3.0) * (3.141 * r * r) * h;
        System.out.println("พื้นที่ทรงกรวย = "+area);
    }

    private static void findTriangleArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ความยาวฐานสามเหลี่ยม: ");
        double b = sc.nextDouble();
        System.out.print("ความสูงสามเหลี่ยม: ");
        double h = sc.nextDouble();
        double area = 0.5 * b * h;
        System.out.println("พื้นที่สามเหลี่ยม = " + area);
    }
}//class