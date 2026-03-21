package lists;

public interface Stack<E> {
  /**
   * Inserts an element at the top of the stack.
   * @param e the element to insert
   */
  void push(E e);

  /**
   * Removes and returns the top element of the stack.
   * @return removed element
   */
  E pop();

  /**
   * Tests whether the stack is empty.
   * @return true if the stack is empty, false otherwise
   */
  boolean isEmpty();

  public static <E> void transfer(Stack<E> S, Stack<E> T){
      while(!S.isEmpty()){
          T.push(S.pop());
      }
  }
}
