package Lab6;

import java.util.StringTokenizer;

public class Example_StringToken {
    public static void main(String[] args){

        StringBuffer str = new StringBuffer("การเรียนรู้คืออะไร? ACTIVE LEARNING เป็นอย่างไร?" +
                "ดำเนินชีวิตในวันหนึ่งๆ เราทุกคนอาจต้องเผชิญสถานการณ์ต่างๆ" +
                " ที่คล้ายคลึงกับที่เคยประสบการณ์มาแต่ไม่ได้เป็นสถานการณ์ที่ตรงกันเลยทีเดียว " +
                "มนุษย์จึงได้เรียนรู้ที่จะปรับตัวด้วยการแสดงพฤติกรรมต่างๆ กับสถานการณ์ที่ตนประสบอยู่  " +
                "เป็นไปได้ยากยิ่งที่ที่เมื่อถามถึงคำจำกัดความของการเรียนรู้ แล้วจะสามารถบอกได้ทันที ว่า" +
                " การเรียนรู้ คือ อะไร ดังนั้น เพื่อให้เกิดความเข้าใจตรงกัน จึงขอเสนอคำจำกัดความของการเรียนรู้ " +
                "จากนักจิตวิทยาและนักการศึกษาหลายๆ ท่าน");
        StringTokenizer strToken = new StringTokenizer(str.toString());
        int conutWord = strToken.countTokens();
        System.out.println("Word count: "+conutWord);

        while (strToken.hasMoreTokens()){
            System.out.println(strToken.nextToken());
        }
    }

}
