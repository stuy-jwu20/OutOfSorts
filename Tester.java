import java.util.Random;
import java.util.ArrayList;
public class Tester {
  public static void main(String[]args){

    Random rng = new Random();
    // for(int i =  0; i < 5; i++ ){
    //   System.out.println(rng.nextInt() % 1000);
    // }
    // System.out.println();

    int arraySize = (int)(Math.random() * 100);
    int[] rngArray = new int[arraySize];
    ArrayList<Integer> rngData = new ArrayList<Integer>();
    for (int i =  0; i < arraySize; i++) {
      rngArray[i] = (rng.nextInt() % 1000);
    }
    Sorts.bubbleSort(rngArray);
    for (int i = 0; i < rngArray.length; i++) {
      rngData.add(rngArray[i]);
    }
    System.out.println(rngData);
  }
}
