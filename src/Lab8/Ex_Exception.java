package Lab8;

import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_Exception {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter an integer number: ");
            int num = sc.nextInt();
            System.out.println("the number is "+num);

        }catch (InputMismatchException ex){
            ex.printStackTrace();
        }


        System.out.println("Good Bye.");



    }
}
