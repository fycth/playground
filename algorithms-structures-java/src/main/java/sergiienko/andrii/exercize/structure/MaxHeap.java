package sergiienko.andrii.exercize.structure;

public class MaxHeap {
  private Integer[] heap;

  public MaxHeap(Integer[] a) {
    heap = new Integer[a.length];
    System.arraycopy(a, 0, heap, 0, a.length);
    build();
  }

  private void build() {
    for (int i = 0; i < heap.length; i++) {
      int j = i;
      while (j != 0) {
        int p = (j - 1) / 2;
        if (heap[j] <= heap[p]) break;
        int b = heap[j];
        heap[j] = heap[p];
        heap[p] = b;
        j = p;
      }
    }
  }

  private int removeTopItem(int size) {
    int top = heap[0];
    heap[0] = heap[size - 1];
    int i = 0;
    while (true) {
      int l = 2 * i + 1;
      int r = 2 * i + 2;
      if (l >= size) l = i;
      if (r >= size) r = i;
      if (heap[i] >= heap[l] && heap[i] >= heap[r]) break;
      int j = heap[l] > heap[r] ? l : r;
      int b = heap[i];
      heap[i] = heap[j];
      heap[j] = b;
      i = j;
    }
    return top;
  }

  public void sort() {
    for (int i = heap.length; i > 0; i--) {
      heap[i - 1] = removeTopItem(i);
    }
  }

  public int length() {
    return heap.length;
  }

  Integer[] getHeapAsArray() {
    return heap;
  }
}
