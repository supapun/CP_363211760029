package Lab7;

public class StudentApp {
    public static void main(String[] args) {

        // create object of Student class
        Student std1 = new Student();

        std1.setName("Puriwat Lertkrai");
        std1.setPerson_id("1111111111111");
        std1.setAge(25);

        displayDataObject(std1);

        Student std2 = new Student();
        std2.setName("Piyapong Senanus");
        std2.setPerson_id("2222222222222");
        std2.setAge(35);

        displayDataObject(std2);

        std2.setName("Piyapat Senanus");

        Student std3 = new Student("Nattapong Kaewboonma",
                "3333333333333",40);

        displayDataObject(std3);

        System.out.println(std3.toString());







    }//main

    private static void displayDataObject(Student std) {
        System.out.println(std.getName());
        System.out.println(std.getPerson_id());
        System.out.println(std.getAge());


    }
}//class