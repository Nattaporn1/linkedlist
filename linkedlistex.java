import java.util.*;
public class linkedlistEx {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<String>();
        name.add("a");
        name.add("b");
        name.add("c");
    System.out.println("after add data"+ " " + name);
        //name.add("e");
        name.add(0,"e");//0 คือตำแหน่ง กำหนดให้ e มาอยู่หน้าสุด
        System.out.println("after add data and set point e to be in front" + " "+ name);
        name.remove();//สามารถกำหนดตัวที่จะเอาออกได้
        System.out.println("after Clear data  front in variable name" + " "+name );
        name.set(1, "e");//กำหนดว่าจะเปลื่ยนตำแหน่งไหนจากนั้นใส่ข้อมูลไป
        System.out.println("after set point" + " " + name);
        name.get(1);
        System.out.println("after get point" + " " + name);
    }
}
