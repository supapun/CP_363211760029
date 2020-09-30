package Lab7;

public class StudentApp {
    public static void main(String[] args){

        //create object of Student calss
        Student std1 = new Student();

        std1.setName("supapun saitong-in");
        std1.setPerson_id("1111111111111");
        std1.setAge(20);

        displayDataObject(std1);
        Student std2 = new Student();
        std2.setName("gat ploiphailin");
        std2.setPerson_id("2222222222222");
        std2.setAge(20);

        displayDataObject(std2);

        std2.setName("supapan saitong-in");

        Student std3 = new Student("Nattapong Khowboonma","3333333333333",40" );

        displayDataObject(std3);



    }//main

    private static void displayDataObject(Student std) {
        System.out.println(std.getName());
        System.out.println(std.getPerson_id());
        System.out.println(std.getAge());
    }
}//class

