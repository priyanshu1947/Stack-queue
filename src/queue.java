import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
public class queue
{
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(3);
        queue1.add(6);
        queue1.add(5);
        queue1.add(19);
        queue1.add(1);

        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());


    }
}
