package Week4;

import java.util.ArrayList;

public class Exersize71 {
    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
        for (int i: second) {
            if (first.contains(i)) {
                first.remove((Integer) i);
            }
        }
        first.addAll(second);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(3);
        list1.add(5);

        list2.add(5);
        list2.add(10);
        list2.add(7);

        smartCombine(list1, list2);

        System.out.println(list1);
    }
}
