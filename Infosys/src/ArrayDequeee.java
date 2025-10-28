import java.util.ArrayDeque;

public class ArrayDequeee {
    public static void main(String[] args) {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.offer(12);
        a.offer(15);
        a.offer(25);
        a.offer(26);
        System.out.println(a);
        System.out.println(a.peek());
        System.out.println(a.peekFirst());
        System.out.println(a.peekLast());


        System.out.println(a.poll());
        System.out.println(a.pollFirst());
        System.out.println(a.pollLast());


        System.out.println(a.removeLast());
        System.out.println(a);
    }
}
