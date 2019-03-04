package sergiienko.andrii.exercize.structure;

// stack implementation using array

public class StackArray<T> {
  private final Object[] array;
  private int top = -1;

  public StackArray(int size) {
    array = new Object[size];
  }

  public T push(T element) {
    if (top < array.length - 1) {
      top++;
      array[top] = element;
      return element;
    } else {
      return null;
    }
  }

  @SuppressWarnings("unchecked")
  public T pop() {
    if (top < 0) {
      return null;
    } else {
      top--;
      return (T)(array[top + 1]);
    }
  }

  @SuppressWarnings("unchecked")
  public T peek() {
    if (top < 0) {
      return null;
    } else {
      return (T)(array[top]);
    }
  }

  public boolean isEmpty() {
    return top < 0;
  }
}
