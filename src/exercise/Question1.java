package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question1 {

    public static class bmi{

        public static void main(String[] args) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner sc = new Scanner(System.in);

            System.out.println("Please Enter Your Height Is M");

            System.out.println("Please Enter Your Weight Is Kg");

            double height ;
            String  H  = "";

            double weight ;
            String W  = "";
            double b = 0.0d;


            try{
                System.out.println("enter Height");
                H =  br.readLine();
                System.out.println("enter weight");
                W = br.readLine();

            }

            catch (IOException e){
                System.out.println("Error!"); }


            height= Double.parseDouble(H);
            weight = Double.parseDouble(W);
            b= weight/(height*height);

            System.out.println("BMI"+ b );

            if(b<18.5){
                System.out.println("Underweight");

            }
            if(18.5<b){
                if(b<24.9)
                    System.out.println("Normal weight");

            }
            if(25.0<b){
                if(b<29.9)
                    System.out.println("Overweight");
            }

            if(b>30){
                System.out.println("Obesity");
            }



        }//main
    }

}//class