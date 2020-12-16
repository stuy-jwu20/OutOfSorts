public class Sorts {

  public static void bubbleSort(int[] data) {

    int didSort = 0;
    for (int i = 0; i < data.length; i++) {
      for (int k = 0; k < data.length-1; k++) {
        if (data[k] > data[k+1]) {
          int tempData = data[k+1];
          didSort++;
          data[k+1] = data[k];
          data[k] = tempData;
        }
      }
    }

  }
}
