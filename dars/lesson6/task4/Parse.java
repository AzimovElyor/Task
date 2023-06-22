package online.dars.lesson6.task4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Parse {

    public Date parse(String date) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
       return simpleDateFormat.parse(date);

    }
}
class Test {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sanani kiriting (dd-MM-yyyy) -> ");
        String date = scanner.nextLine();
        Parse parse = new Parse();
        System.out.println(parse.parse(date));

    }

    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i = 0; i < target.length; i++){
            Integer val = map.get(target[i]);
            if(val == null) map.put(target[i],1);
            else map.put(target[i],val+1);

            Integer val2 = map1.get(arr[i]);
            if(val2== null) map1.put(arr[i],1);
            else map1.put(arr[i],val2+1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map1.entrySet();
        Set<Map.Entry<Integer, Integer>> entries2 = map.entrySet();
        if(entries2.size() != entries.size()) return false;
        for (Map.Entry<Integer, Integer> entry : entries2) {
           if(!entries.contains(entry)) return false;
        }
        return true;
    }
}
