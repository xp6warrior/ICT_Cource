package Week4;

import java.util.ArrayList;

public class Exersize76 {
    public static class Menu {
        private ArrayList<String> meals;

        public Menu() {
            this.meals = new ArrayList<String>();
        }

        public void addMeal(String name) {
            meals.add(name);
        }

        public void printMeals() {
            for (String s: meals) {
                System.out.println(s);
            }
        }

        public void clearMenu() {
            meals.clear();
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addMeal("Chips");
        menu.addMeal("Fish");
        menu.addMeal("Pizza");
        menu.printMeals();
        menu.clearMenu();
        menu.printMeals();
    }
}
