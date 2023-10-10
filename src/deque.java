import java.util.*;
public class deque
{
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        {
            deque.add(34);
            deque.addFirst(17);
            deque.addLast(68);
            deque.removeLast();
            System.out.println(deque);
        }
    }

}
