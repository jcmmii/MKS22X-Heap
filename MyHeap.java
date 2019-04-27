public class MyHeap {
  private static void pushDown(int[]data, int size, int index) {
    int temp;
    if (index * 2 + 1 >= size) return;
    if (data[2*index+1] > data[2*index+2]) {
      if (data[index] < data[2*index+1]) {
        temp = data[2*index+1];
        data[2*index+1] = data[index];
        data[index] = temp;
      }
    } else {
      if (data[index] < data[2*index+2]) {
        temp = data[2*index+2];
        data[2*index+2] = data[index];
        data[index] = temp;
      }

    }



  }

  private static void pushUp(int[]data,int index) {

  }

  public static void heapify(int[]) {

  }

  public static void heapsort(int[]) {

  }

}
