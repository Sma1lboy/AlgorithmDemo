import java.util.*;

public class test {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 6);
        map.put(3, 3);
        Set<Integer> set = map.keySet();
        Set<Map.Entry<Integer, Integer>> test1 = map.entrySet();
        Queue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        q.addAll(test1);
        System.out.println(test1);
        System.out.println(q.poll().getValue());
        System.out.println(q.poll().getValue());
        System.out.println(q.poll().getValue());

    }
}
