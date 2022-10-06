package Week3;

import java.util.ArrayList;

public class Exersize67 {
    public static double variance(ArrayList<Integer> list) {
        double average = Exersize64.average(list);
        double variance = 0;
        for (int i: list) {
            variance += Math.pow(i - average, 2);
        }
        variance /= list.size() - 1;
        return variance;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }
}
