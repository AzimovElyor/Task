package online.dars.lesson5.task1;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Task1 {
    public static void main(String[] args) {
       /* Random random = new Random();
        int size = 50_000_000;
        double[] arr = new double[size];
        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt();
        }
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        MyRecursiveTask task = new MyRecursiveTask(arr, 0, size);
        System.out.println(forkJoinPool.invoke(task));*/
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
    }
    public static int countPoints(String rings) {
      String[] arr = new String[]{"","","","","","","","","",""};
      for(int i = 0; i < rings.length(); i+=2){
          arr[rings.charAt(i + 1)-'0'] += rings.charAt(i);
      }
      int counter = 0;

      for(int i = 0; i < arr.length; i++){
          int count = 0;
          String s = "RGB";

              for (int j = 0; j < s.length(); j++) {
                  if (arr[i].contains(String.valueOf(s.charAt(j)))) count++;
                  if (count == 3) break;
              }
          if(count == 3) counter++;
      }
      return counter;
    }
}
