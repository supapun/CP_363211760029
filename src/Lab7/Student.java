package Lab7;

public class Student {
    private String name;
    private String person_id;
    private int age;
    //constructor
    //default constructor
    public Student(){}
    //design constructor
    public Student(String n,String pid,int a){
        name = n;
        person_id = pid;
        age = a;
    }

    //getter and setter
    //get คือ อ่านข้อมูลจาก attributes ของ object
    //set คือ เปลี่ยนแปลงหรือปรับปรุงข้อมูล attributes ของ object

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public String getPerson_id(){
        return person_id;
    }
    public void setPerson_id(String p_id){
        person_id = p_id;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }


}//calss

