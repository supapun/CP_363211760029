package exercise;

import java.util.Scanner;

public class Excersice_Lab3_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "mit212";
        String password = "1234";


        int count = 0;
        do {
            System.out.print("Username: ");
            String u = sc.nextLine();
            System.out.print("Password: ");
            String p = sc.nextLine();
            if (u.equals(username) && p.equals(password)) {
                System.out.println("Welcome to MT System.");
                break;
            } else {
                System.out.println("Username or Password is not correct.");
                count++;
                if (count == 3) {
                    System.out.println("Your account has been locked. Please, contact Admin");
                }
            }
        } while (count < 3);

    }
}



