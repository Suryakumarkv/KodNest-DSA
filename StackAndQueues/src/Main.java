//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
//        CustomStack stack = new DynamicStack();
//      stack.push(1);
//      stack.push(2);
//      stack.push(3);
//      stack.push(4);
//      stack.push(5);
//      stack.push(6);
//
//
//      System.out.println(stack.peek());
//
//      System.out.println(stack.pop());
//      System.out.println(stack.pop());
//      System.out.println(stack.pop());
//      System.out.println(stack.pop());
//      System.out.println(stack.pop());
////      System.out.println(stack.pop());
//
//        System.out.println(stack.peek());


//        Queues queues = new Queues();
//        queues.insertData(10);
//        queues.insertData(20);
//        queues.insertData(30);
//        queues.insertData(40);
//        queues.insertData(50);
//        queues.insertData(60);
//        queues.insertData(70);
//        queues.insertData(80);
//        queues.insertData(90);
//        queues.insertData(100);
//
//        queues.display();
//        System.out.println("*********************************");
//       System.out.println(queues.remove());
//        queues.display();


        CircularQueue circularQueue = new CircularQueue(10);
        circularQueue.insertData(10);
        circularQueue.insertData(20);
        circularQueue.insertData(30);
        circularQueue.insertData(40);
        circularQueue.insertData(50);

        circularQueue.insertData(60);

        circularQueue.displayQueue();

        System.out.println(circularQueue.remove());

        circularQueue.insertData(70);
        circularQueue.displayQueue();

    }
}