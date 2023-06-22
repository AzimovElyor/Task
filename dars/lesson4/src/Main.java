import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int j : nums1) {
            set1.add(j);
        }
        int counter = 0;
       /* for(int i = 0; i < nums2.length; i++){
            if (!set1.add(nums2[i])) ne
        }*/
        return Arrays.stream(nums2).filter(value -> !set1.add(value)).toArray();

    }

}
 
