package lists;

public class LinkedQueue<E> {
  private SinglyLinkedList<E> list = new SinglyLinkedList<>();

  public LinkedQueue() { }

  public int size() {
    return list.size();
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public void enqueue(E e) {
    list.addLast(e);
  }

  public E first() {
    return list.first();
  }

  public E dequeue() {
    return list.removeFirst();
  }

  public void concatenate(LinkedQueue<E> Q2) {
    list.concatenate(Q2.list);
  }

  public String toString() {
    return list.toString();
  }
}
