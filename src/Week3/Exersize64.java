package Week3;

import java.util.ArrayList;

public class Exersize64 {
    public static double average(ArrayList<Integer> list) {
        double average = 0;
        for (int i: list) {
            average += i;
        }
        return average / list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }

}
