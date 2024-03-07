public class ArrayNode {
    int[] data;
    ArrayNode next;

    // Constructor to initialize the array data and next pointer
    public ArrayNode(int[] data) {
        this.data = data;
        this.next = null;
    }
    public static void main(String[] args) {
               LinkedListForArray list = new LinkedListForArray();
        
               // สร้างและเพิ่มข้อมูลลงใน linked list
        	        int[] array1 = {1, 2, 3};
       	        int[] array2 = {4, 5, 6};
             int[] array3 = {7, 8};
        	        list.append(array1);
        	        list.append(array2);
        	        list.append(array3);
        	
        	        // พิมพ์ linked list
        	        list.printList();
        	    }
        	}

  class LinkedListForArray {
    ArrayNode head;

    // คอนสตรักเตอร์เพื่อกำหนดค่าโหนดหัว
    public LinkedListForArray() {
        this.head = null;
    }

    // เมธอดเพิ่มโหนดอาร์เรย์ที่ส่วนท้ายของลิงก์ลิสต์
    public void append(int[] data) {
        ArrayNode newNode = new ArrayNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ArrayNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // เมธอดพิมพ์ลิงก์ลิสต์
    public void printList() {
        ArrayNode current = head;
        while (current != null) {
            for (int value : current.data) {
                System.out.print(value + " ");
            }
            System.out.println();
            current = current.next;
        }
    }
}
