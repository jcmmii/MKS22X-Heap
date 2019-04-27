public class MyHeap {
  private static void pushDown(int[]data, int size, int index) {
    int temp;
    if (index * 2 + 1 >= size) return; //base case when index is greater than size
    if (index * 2 + 1 = size - 1) { //when one child, at the end
      if (data[index] < data[index*2 + 1]) { //if child is greater
        temp = data[index*2+1];
        data[2*index+1] = data[index];
        data[index] = temp;
      }
    }
    if (index * 2 + 1 != size - 1) {  //not at the end
      if (data[2*index+1] > data[2*index+2]) { //left child > right child
        if (data[index] < data[2*index+1]) {   //if current index < left child, swaps
          temp = data[2*index+1];
          data[2*index+1] = data[index];
          data[index] = temp;
          pushDown(data,size,2*index+1);
        }
      } else if (data[2*index+1] <= data[2*index+2]){ // left child <= right child
          if (data[index] < data[2*index+2]) {   //if current index < right child, swaps
            temp = data[2*index+2];
            data[2*index+2] = data[index];
            data[index] = temp;
            pushDown(data,size,2*index+2);
          }
        }
      }
    }

  private static void pushUp(int[]data, int index) {
    int temp;
    int i = (index-1)/2;
    if (i == 0) return;
    if (data[i] < data[index]) {
      temp = data[i];
      data[i] = data[index];
      data[index] = temp;
      pushUp(data,i);
    }
  }

//public static void heapify(int[]) {

  }

//  public static void heapsort(int[]) {

  }
