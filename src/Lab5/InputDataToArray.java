package Lab5;

import java.util.Scanner;

public class InputDataToArray {
    public static void main(String[] args) {

        int num[] = new int[5];
        //input data to array
        num = inputData(num);
        //display data in array
        displayArray(num);
        //find total value in array
        findTotalValue(num);
        //findMax
        findMax(num);
        //findMin
        findMin(num);



    }//main

    private static void findMin(int[] num) {
        int min = num[0];
        for (int val:num) {
            if(min >= val)
                min = val;
        }
        System.out.println("The minimum value is "+min);
    }

    private static void findMax(int[] num) {
        int max = num[0];
        for (int val:num) {
            if(max <= val)
                max = val;
        }
        System.out.println("The maximum value is "+max);
    }

    private static void findTotalValue(int[] num) {
        int total = 0;
        for (int val:num) {
            total += val;
        }
        System.out.println("Total value in array:"+total);
        System.out.println("Average value in array:"+(total/ num.length));
    }

    private static void displayArray(int[] number) {
        System.out.println("Data in array: ");
        for (int val:number) {
            System.out.print(val+" ");
        }
        System.out.println();
    }
    private static int[] inputData(int[] num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {  // num.length คือ ขนาดของ array
            System.out.print("Enter integer (index)"+i+": ");
            num[i] = sc.nextInt();
        }
        return num;
    }

}//class