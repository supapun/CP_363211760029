package exercise;

import java.util.Scanner;

public class Chapter4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int x = scanner.nextInt();

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();
    }
}
