import java.util.*;
public class Tester {
  public static void main(String[]args){

// bubbleSort() with unsorted and random values //

    int testCases = (int)(Math.random() * 10000);
    int equalAmount = 0;

    for (int i = 0; i < testCases; i++) {
      Random rng = new Random();
      int arraySize = (int)(Math.random() * 1000);
      int[] rngArray = new int[arraySize];
      ArrayList<Integer> rngData = new ArrayList<Integer>();

      for(int k =  0; k < arraySize; k++ ){
        int currentSeedInt = (rng.nextInt() % 1000);
        rngArray[k] = currentSeedInt;
        rngData.add(currentSeedInt);
      }

      Collections.sort(rngData);
      Sorts.bubbleSort(rngArray);
      ArrayList<Integer> sortedBubbleData = new ArrayList<Integer>();

      for (int data : rngArray) {
          sortedBubbleData.add(data);
      }

      if (rngData.equals(sortedBubbleData)) {
        equalAmount++;
      } else {
        System.out.println("They are not equal at case " + i);
        System.out.println("Expected: \n" + rngData);
        System.out.println("Actual: \n" + Arrays.toString(rngArray));
      }

    }

    if (equalAmount == testCases) {
      System.out.println("bubbleSort() passed with unsorted and random values!");
    }

// bubbleSort() if length is 0 //

    int[] zeroCases = new int[0];
    ArrayList<Integer> zeroData = new ArrayList<Integer>();
    ArrayList<Integer> sorted0Data = new ArrayList<Integer>();
    Sorts.bubbleSort(zeroCases);
    Collections.sort(sorted0Data);

    for (int data : zeroCases) {
        sorted0Data.add(data);
    }

    if (zeroData.equals(sorted0Data)) {
      System.out.println("bubbleSort() works with 0 data!");
    } else {
      System.out.println("They are not equal with 0 cases.");
      System.out.println("Expected: \n" + zeroData);
      System.out.println("Actual: \n" + Arrays.toString(zeroCases));
    }

// bubbleSort() if length is 1 //

    int singleEqualAmount = 0;
    for (int l = 0; l < testCases; l++) {
      int[] oneCase = new int[1];
      int singleCase = (int)(Math.random() * 1000);
      oneCase[0] = singleCase;
      ArrayList<Integer> oneData = new ArrayList<Integer>();
      oneData.add(singleCase);
      ArrayList<Integer> sorted1Data = new ArrayList<Integer>();
      Sorts.bubbleSort(oneCase);
      Collections.sort(sorted1Data);

      for (int data : oneCase) {
          sorted1Data.add(data);
      }

      if (oneData.equals(sorted1Data)) {
        singleEqualAmount++;
      } else {
        System.out.println("They are not equal with 1 cases.");
        System.out.println("Expected: \n" + oneData);
        System.out.println("Actual: \n" + Arrays.toString(oneCase));
      }
    }

    if (singleEqualAmount == testCases) {
        System.out.println("bubbleSort() works with 1 data!");
    }
        
  }
}
