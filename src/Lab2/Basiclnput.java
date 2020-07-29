package Lab2;

import java.util.Scanner;

public class Basiclnput {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter you name ?: ");
        String name = scanner.nextLine();
        System.out.println("Your name is "+name);

        System.out.print("อายุเท่าไหร่ ?: ");
        int age = scanner.nextInt();
        System.out.println("อายุของคุณคือ " + age);

        System.out.println("Enter you nick name ?: ");
        String nickname = scanner.nextLine();
        System.out.println("Your nick name is "+name);

    }//main

}
