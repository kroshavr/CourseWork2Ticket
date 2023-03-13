import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "AAA");
        map.put(2, "BBB");
        map.put(3, "CCC");

        Set <Map.Entry <Integer, String>> set = map.entrySet();

        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Map.Entry<Integer, String> i : set) {
            System.out.print(i + ", ");
        }
    }
}