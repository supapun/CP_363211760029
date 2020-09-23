package Lab6;

public class Example_StringBuffer {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("Supapun Saitongin");
        str.append("RUTS");
        str.insert(17, " ");
        System.out.println(str);
        str.replace(0,7,"Miw");
        System.out.println(str.reverse());
    }
}
