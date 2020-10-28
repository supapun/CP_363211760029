package exercise;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        int age;
        double weight, height, bmr;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender(m/f): ");
        String gen = sc.nextLine();
        System.out.println("Enter weight: ");
        weight = Double.parseDouble(sc.nextLine());
        System.out.println("Enter height: ");
        height = Double.parseDouble(sc.nextLine());
        System.out.println("Enter age: ");
        age = Integer.parseInt(sc.nextLine());

        if (gen == "man"){
            bmr = (10 * weight) + (6.25 * height) - (5 * age) + 5;

        }else{
            bmr = (10 * weight) + (6.25 * height) - (5 * age) - 161;

        }

        System.out.println("Your BMR is: "+bmr);

        System.out.println("How about your activity ?");
        System.out.println("1. No exercise");
        System.out.println("2. 1-3 day per week");
        System.out.println("3. 3-5 day per week");
        System.out.println("4. 6-7 day per week");
        System.out.println("5. heavy exercise sportsman)");
        System.out.println("Slect ?: ");
        int seclect = Integer.parseInt(sc.nextLine());
        double tdee =0;

        if (seclect==1){
            tdee = bmr*1.2;
        }
        else if (seclect==2){
            tdee = bmr*1.375;
        }else if (seclect==3){
            tdee = bmr*1.555;
        }else if (seclect==4){
            tdee = bmr*1.725;
        }else {
            tdee = bmr*1.99;
        }

        System.out.println("You TDEE is : "+tdee);








    }
}