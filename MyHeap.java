public class MyHeap {
  private static void pushDown(int[]data, int size, int index) {
    int temp;
    if (2*index+1 >= size) return; //base case when index is greater than size
    if (2*index+1 == size-1) { //when one child, at the end
      if (data[index] < data[2*index+1]) { //if child is greater
        temp = data[index*2+1];
        data[2*index+1] = data[index];
        data[index] = temp;
      }
    }
    if (2*index+1 != size - 1) { //not at the end
      if (data[2*index+1] > data[2*index+2]) { //left child > right child
        if (data[index] < data[2*index+1]) { //if current index < left child, swaps
          temp = data[2*index+1];
          data[2*index+1] = data[index];
          data[index] = temp;
          pushDown(data,size,2*index+1); //recursively calls pushDown again, this time with the left child
        }
      } else if (data[2*index+1] <= data[2*index+2]){ // left child <= right child
          if (data[index] < data[2*index+2]) {   //if current index < right child, swaps
            temp = data[2*index+2];
            data[2*index+2] = data[index];
            data[index] = temp;
            pushDown(data,size,2*index+2); //calls pushDown again with right child
          }
        }
      }
    }

  private static void pushUp(int[]data, int index) {
    int temp;
    int i = (index-1)/2;
    if (i == 0) return; //stops if at the top
    if (data[i] < data[index]) {
      temp = data[i];
      data[i] = data[index];
      data[index] = temp;
      pushUp(data,i); //recursively keeps swapping with the parent
    }
  }

  public static void heapify(int[] data) {
    for (int i = 0; i < data.length; i++) {
      pushUp(data,i); //goes through each index and pushes it up if needed
    }
  }

  public static void heapsort(int[] data) {
    heapify(data); //makes it a heap
    int temp;
    for (int i = data.length; i > 0; i--) {
      pushDown(data,i,0);
      temp = data[0];
      data[0] = data[i-1];
      data[i-1] = temp;
    }
  }

  }
