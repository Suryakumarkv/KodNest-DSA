public class Main {
    public static void main(String[] args) {
       DLL dll = new DLL();
       dll.insertFirst(25);
       dll.insertFirst(26);
       dll.insertFirst(27);
       dll.insertFirst(28);
       dll.insertFirst(29);
       dll.insertFirst(30);
       dll.insertFirst(31);
       dll.insertFirst(32);


       dll.insertLast(155);

       dll.insert(27, 256);
       dll.display();

    }
}