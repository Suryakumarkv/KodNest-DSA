class Main {
    public static void main(String[] args) {
        ll ll1 = new ll();
        ll1.insertFirst(5);
        ll1.insertFirst(6);
        ll1.insertFirst(7);
        ll1.insertFirst(8);
        ll1.insertFirst(9);
        ll1.insertFirst(10);
        ll1.display();

        ll1.insertLast(25);
        ll1.insertLast(26);
        ll1.display();

        ll1.inserAt(33, 5);
        ll1.display();

        ll1.deleteFirt();
        ll1.display();
    }
}
