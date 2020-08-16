import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

  public static void main(final String[] args) {
    final Deque<String> deque = new LinkedList<>();

    deque.addFirst("a");
    deque.addFirst("b");
    deque.addFirst("c");

    System.out.println(deque);

    final String str = deque.peek();

    System.out.println(str);
    System.out.println(deque);

    while (deque.size() > 0) {
      System.out.println(deque.removeFirst());
    }

    System.out.println(deque);
  }
}
