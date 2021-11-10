package stack;

/**
 * A {@link LinkedStack} is a stack that is implemented using a Linked List structure to allow for
 * unbounded size.
 *
 * @param <T> the elements stored in the stack
 */
public class LinkedStack<T> implements StackInterface<T> {
  private LLNode<T> stack;
  private int size;

  /** {@inheritDoc} */
  @Override
  public T pop() throws StackUnderflowException {
    // TODO: Implement the stack operation for `pop`!
    if(isEmpty()){
      throw new StackUnderflowException();
    }
    T temp = stack.getData();
    stack = stack.getNext();
    size--;
    return temp;
  }

  /** {@inheritDoc} */
  @Override
  public T top() throws StackUnderflowException {
    // TODO: Implement the stack operation for `top`!
    if( size == 0){
      throw new StackUnderflowException();
    }
    return stack.getData();
  }

  /** {@inheritDoc} */
  @Override
  public boolean isEmpty() {
    // TODO: Implement the stack operation for `isEmpty`!
    return size == 0;
  }

  /** {@inheritDoc} */
  @Override
  public int size() {
    // TODO: Implement the stack operation for `size`!
    return size;
  }

  /** {@inheritDoc} */
  @Override
  public void push(T elem) {
    // TODO: Implement the stack operation for `push`!
    if( size == 0){
      LLNode<T> newElement = new LLNode<T>(elem);
      stack = newElement;
      size++;
    }
    else{
      LLNode<T> newElement = new LLNode<T>(elem);
      newElement.setNext(stack);
      stack = newElement;
      size++;
    }
  }
}
