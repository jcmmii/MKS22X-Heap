public class MyHeap {
  private static void pushDown(int[]data, int size, int index) {
    int temp;
    if (index * 2 + 1 >= size) return; //base case when index is greater than size
    if (index * 2 + 1 = size - 1) {
      if (data[index] < data[index*2 + 1]) {
        temp = data[index*2+1];
        data[2*index+1] = data[index];
        data[index] = temp;
      }
    }
    if (data[2*index+1] > data[2*index+2]) { //left child > right child
      if (data[index] < data[2*index+1]) {   //if current index < left child, swaps
        temp = data[2*index+1];
        data[2*index+1] = data[index];
        data[index] = temp;
        pushDown(data,size,2*index+1);
      }
    } else { // left child < right child
        if (data[index] < data[2*index+2]) {        //if current index < right child, swaps
          temp = data[2*index+2];
          data[2*index+2] = data[index];
          data[index] = temp;
          pushDown(data,size,2*index+2);
        }
      }
  }
}

//  private static void pushUp(int[]data,int index) {

  }

//public static void heapify(int[]) {

  }

//  public static void heapsort(int[]) {

  }
