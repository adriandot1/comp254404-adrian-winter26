package lists;

public class LinkedQueueConcatDemo {
  public static void main(String[] args) {
    LinkedQueue<Integer> q1 = new LinkedQueue<>();
    LinkedQueue<Integer> q2 = new LinkedQueue<>();

    q1.enqueue(10);
    q1.enqueue(20);
    q1.enqueue(30);

    q2.enqueue(40);
    q2.enqueue(50);
    q2.enqueue(60);

    System.out.println("Before concatenate");
    System.out.println("Q1: " + q1);
    System.out.println("Q2: " + q2);

    q1.concatenate(q2);

    System.out.println("");
    System.out.println("After concatenate");
    System.out.println("Q1: " + q1);
    System.out.println("Q2: " + q2);
    System.out.println("Q1 first: " + q1.first());
    System.out.println("Q2 is empty: " + q2.isEmpty());
  }
}
