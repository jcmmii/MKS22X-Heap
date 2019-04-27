import java.util.*;

public class Driver {
    public static void main(String[] args) {
      int[] testArray = {3000,2008,2019,1942,22,1,-1000,-8,-2,0};
      //last 5 numbers are random test numbers but if you get the references that the
      //first 5 numbers refer to you're a legend :') //(they are references to the MCU lol)
      MyHeap.heapify(testArray);
      System.out.println(Arrays.toString(testArray));
      MyHeap.heapsort(testArray);
      System.out.println(Arrays.toString(testArray));
    }
}
