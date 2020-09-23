package Lab5;

import java.util.Scanner;

public class BasicArray2D {
    public static void main(String[] args) {
        int number [][] = new int[2][3]; //2 * 3 = 6 blocks
        number = inputDataArray(number);
        showDataInArray(number);
        //find total
        findTotal(number);
        //find max
        finfMix(number);
        //find min
        findMin(number);

    }//main

    private static void findTotal(int[][] number) {
    }

    private static void finfMix(int[][] number) {
        int mix = number[0][0];
        for (int i = 0; i < number[i].length ; i++) {
            for (int j = 0; j < number[j].length; j++) {
                if (mix <= number[i][j]){
                    mix = number[i][j];
                }

            }

        }
        System.out.println("m");
    }

    private static void findMin (int[][] number){
        int min = number[0][0];
        for (int i = 0; i < number[i].length ; i++) {
            for (int j = 0; j < number[i].length ; j++) {
                if (min >= number[i][j]) {
                    min = number[i][j];
                }
            }

        }
        System.out.println("Mimimum value in array(2D): "+min);
    }



    private static void showDataInArray(int[][] number) {
        System.out.println("Data in array: ");
        for (int i = 0; i < number.length ; i++) {
            for (int j = 0; j < number [i].length ; j++) {
                System.out.println(number[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int [][] inputDataArray(int[][] number){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter integer to array(2D): ");
        for (int i = 0; i < number.length ; i++) { //row
            for (int j = 0; j < number[i].length ; j++) { // column
                System.out.println("number["+i+"]["+j+"]: ");
                number[i][j] = sc.nextInt();

            } //for j

        } //for i
        return number;
    }





} //class
