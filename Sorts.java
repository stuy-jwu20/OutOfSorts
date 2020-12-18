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

  }

  public static void insertionSort(int[] data){

  }
}
