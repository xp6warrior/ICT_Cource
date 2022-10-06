package Week3;

import java.util.ArrayList;

public class Exersize61 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println(countItems(list));
        printList(list);
        System.out.println();
        removeFirst(list);
        System.out.println(countItems(list));
        printList(list);
    }

    public static int countItems(ArrayList<String> list) {
        return list.size();
    }

    public static void removeFirst(ArrayList<String> list) {
        if (!list.isEmpty()) {
            list.remove(0);
        }
    }

    public static void printList(ArrayList<String> list) {
        for (String s: list) {
            System.out.println(s);
        }
    }
}
