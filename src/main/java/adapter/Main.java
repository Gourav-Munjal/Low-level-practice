package adapter;

import adapter.adaptee.WeightMachineInBabies;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // HashSet
        HashSet<String> ele = new HashSet<>();
        ele.add("abc");
        ele.add("xyz");
        System.out.println(ele.contains("abc"));
        for (String s : ele) {
            System.out.println(s + " ");
        }
        String s = "adv";

        ele.remove("abc");
        System.out.println(ele.size());
        System.out.println(ele.isEmpty());

        // HashMap
        Map<String, Integer> m = new HashMap<>();
        m.put("abc", 111);
        m.put("xyz", 999);
        for (Map.Entry<String, Integer> e : m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        if (m.containsKey("abc")) {
            return;
        }
        m.remove("abc");

        // Stack
//        Stack<Integer> s = new Stack<>();
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.push(10);
        ad.push(20);
        System.out.println(ad.peek());
        System.out.println(ad.pop()); // also removes the top item
//        ad.size() ad.isEmpty()

        // Queue
//        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10); // q.add() which throws exception
        System.out.println(q.peek()); // returns 1st item // q.element()
        System.out.println(q.poll()); // returns first item and removes from queue // q.poll()


        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineInBabies(32));
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
