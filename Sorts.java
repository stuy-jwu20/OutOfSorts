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
    for (int i = 0; i < data.length && data.length > 1; i++) {
      int initialVal = data[i];
      int toSwap;
      for (int k = i + 1 ; k < data.length - 1; k++) {
        if (data[k] < initialVal) {
          toSwap = k;
        }
      }
      data[i] = data[toSwap];
      data[toSwap] = lowVal;
    }
  }

  // public static void insertionSort(int[] data){
  //   for (int i = 1; i < data.length && data.length > 1; i++) {
  //     int currentVal = data[i];
  //     for (int k = 0; k < data.length; k++) {
  //       if (currentVal < data[k]) {
  //         int counter = 0;
  //         int toReplace = data[k];
  //         while (counter < i) {
  //           data[counter+1] = data[counter];
  //           counter++;
  //         }
  //         data[k] = currentVal;
  //       }
  //     }
  //   }
  // }
}
