import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Utils {
    public static <T extends Comparable<T>> T findMax(List<T> items){
        Collections.sort(items);
        return items.getLast();
    }

    public static <T extends Comparable<T>> List<T> filterGreaterThan(List<T> items, T threshold){
        List<T> list = new ArrayList<T>();
        for(T e : items){
            if(e.compareTo(threshold) >= 0){
                list.add(e);
            }
        }
        return list;
    }
}
