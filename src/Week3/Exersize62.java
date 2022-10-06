package Week3;

import java.util.ArrayList;

public class Exersize62 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Exersize61.printList(list);
        removeLast(list);
        Exersize61.printList(list);
    }

    public static void removeLast(ArrayList<String> list) {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
    }
}
