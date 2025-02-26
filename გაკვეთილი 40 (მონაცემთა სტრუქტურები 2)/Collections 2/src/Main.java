import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // 1
//        ArrayList<String> names = new ArrayList<>();
//        names.add("John");
//        names.add("Jane");
//        names.add("Bob");
//        names.remove(1);
//        System.out.println(names);

        // 2
//        HashSet<String> set = new HashSet<>();
//        set.add("A");
//        set.add("B");
//        set.add("C");
//        set.contains("A");
//        System.out.println(set);

//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(-2);
//        set.add(99);
//        set.add(-3);
//        System.out.println(set);


        // 3
//        TreeSet<Integer> set = new TreeSet<>();
//        set.add(1);
//        set.add(-2);
//        set.add(99);
//        set.add(-3);
//        System.out.println(set);
//        System.out.println(set.getFirst());
//        System.out.println(set.getLast());
//        for (int i = 0; i < 2; i++) {
//            set.remove(set.getLast());
//        }
//        System.out.println(set.getLast());
//        for (Integer i : set) {
//            System.out.println(i);
//        }


        // 4
//        HashMap<String, String> map = new HashMap<>();
//        map.put("0159", "Didi digomi");
//        map.put("0163", "Varketili");
//        map.put("0137", "Samgori");
//        map.put("0108", "Rustaveli");
//        System.out.println(map);

//        map.clear();
//        System.out.println(map);

//        System.out.println("Contains key 0159: " + map.containsKey("0159"));
//        System.out.println("Contains key 9999: " + map.containsKey("9999"));
//
//        System.out.println("Contains value Varketili: " + map.containsValue("Varketili"));
//        System.out.println("Contains value Saburtalo: " + map.containsValue("Saburtalo"));

//        Set< Map.Entry<String, String> > entries = map.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            System.out.println(entry);
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }




        // 5
//        HashMap<String, String> map = new HashMap<>();
//        map.put("0159", "Didi digomi");
//        map.put("0163", "Varketili");
//        map.put("0137", "Samgori");
//        map.put("0108", "Rustaveli");
//        System.out.println(map);

//        System.out.println(map.get("0137"));
//        System.out.println(map.isEmpty());
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        map.put("0108", "Saburtalo");
//        System.out.println(map);

//        map.remove("0108");
//        System.out.println(map);
//        map.remove("0137", "Samgorii");
//        System.out.println(map);

//        System.out.println("Size of map: " + map.size());



        // 6
//        HashMap<String, String> map = new HashMap<>();
//        map.put("0159", "Didi digomi");
//        map.put("0163", "Varketili");
//        map.put("0137", "Samgori");
//        map.put("0108", "Rustaveli");
//        System.out.println(map);
//
//        map.putIfAbsent("0108", "Saburtalo");
//        map.putIfAbsent("0109", "Saburtalo");
//        System.out.println(map);



        // 7
//        int[] nums = {1,2,4,1,2,67,2,3,27,4,2,6,3,2,1};
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int x : nums) {
//            if (map.containsKey(x)) {
//                map.put(x, map.get(x) + 1);
//            } else {
//                map.put(x, 1);
//            }
//        }
//        System.out.println(map);



        // 8
        Animal a1 = new Animal("Dog", 3);
        Animal a2 = new Animal("Cat", 4);
        Animal a3 = new Animal("Cow", 8);

        HashSet<Animal> animals = new HashSet<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a1);
        System.out.println(animals);


        Animal a4 = new Animal("Dog", 3);
        System.out.println(a1.equals(a4));
        animals.add(a4);
        System.out.println(animals);
    }
}