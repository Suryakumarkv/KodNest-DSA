public class Main {
    public static void main(String[] args) {
         singlyLinkedList list = new singlyLinkedList();
         list.insertFirst(3);
         list.insertFirst(5);
         list.insertFirst(7);
         list.insertFirst(9);
         list.insertFirst(10);
         list.insertFirst(11);

//         list.insertLast(255);
//        list.display();
//         list.insertAtParticularIndex(500, 3);
//         System.out.println(list.deleteFirst());
//         list.display();
         System.out.println(list.deleteLast());
         list.display();
         System.out.println(list.delete(2));
         list.display();


         System.out.println(list.findValue(5));
    }
}