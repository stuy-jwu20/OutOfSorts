import java.util.*;
public class Sorts {
  public static void bubbleSort(int[] data) {
    for (int i = 0; i < data.length && data.length > 1; i++) {
      int didSort = 0;
      for (int k = 0; k < data.length-1; k++) {
        if (data[k] > data[k+1]) {
          int tempData = data[k+1];
          didSort++;
          data[k+1] = data[k];
          data[k] = tempData;
        }
      }
      if (didSort == 0) {
        i = data.length;
      }
    }
  }

  public static void selectionSort(int[] data) {
    for (int i = 0; data.length > 1 && i < data.length; i++) {
      int toSort = data[i];
      int lowestData = data[i];
      int toSwap = -1;
      for (int k = i; k < data.length; k++) {
        if (data[k] < lowestData) {
          lowestData = data[k];
          toSwap = k;
        }
      }
      if (toSwap != -1) {
        data[i] = lowestData;
        data[toSwap] = toSort;
      }
    }
  }

  public static void insertionSort(int[] data){
    for (int i = 1; i < data.length && data.length > 1; i++) {
      if (data[i] < data[i-1]) {
        int currentVal = data[i];
        for (int k = 0; k < data.length; k++) {
          if (currentVal < data[k]) {
            int counter = i;
            while (counter > k) {
              data[counter] = data[counter-1];
              counter--;
            }
            data[k] = currentVal;
            k = data.length;
          }
        }
      }
    }
  }
}
