package lists;

public class ArrayStack<E> implements Stack<E> {
  private static final int CAPACITY = 1000;
  private E[] arr;
  private int top = -1;

  public ArrayStack() {
    this(CAPACITY);
  }

  @SuppressWarnings("unchecked")
  public ArrayStack(int capacity) {
    arr = (E[]) new Object[capacity];
  }

  @Override
  public void push(E e) {
    if (top == arr.length - 1) {
      throw new IllegalStateException("Stack is full");
    }
    top++;
    arr[top] = e;
  }

  @Override
  public E pop() {
    if (isEmpty()) return null;
    E temp = arr[top];
    arr[top] = null;
    top--;
    return temp;
  }

  @Override
  public boolean isEmpty() {
    return top == -1;
  }

  public E top() {
    if (isEmpty()) return null;
    return arr[top];
  }

  public int size() {
    return top + 1;
  }

  public String toString() {
    String s = "[";
    for (int i = 0; i <= top; i++) {
      s += arr[i];
      if (i < top) {
        s += ", ";
      }
    }
    s += "]";
    return s;
  }
}
