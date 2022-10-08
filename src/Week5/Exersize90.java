package Week5;

import java.util.ArrayList;

public class Exersize90 {
    public static class Team {
        private final String name;
        private int maxSize = 16;
        private int size = 0;
        private final ArrayList<Player> players = new ArrayList<>();

        public Team(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int size() {
            return size;
        }

        public int goals() {
            int goals = 0;
            for (Player plr: players) {
                goals += plr.getGoals();
            }
            return goals;
        }

        public void setMaxSize(int maxSize) {
            this.maxSize = maxSize;
        }

        public void addPlayer(Player plr) {
            if (size < maxSize) {
                players.add(plr);
                size++;
            }
        }

        public void printPlayers() {
            for (Player plr: players) {
                System.out.println(plr);
            }
        }
    }

    public static class Player {
        private final String name;
        private final int goals;

        public Player(String name, int goals) {
            this.name = name;
            this.goals = goals;
        }

        public Player(String name) {
            this.name = name;
            this.goals = 0;
        }

        public String getName() {
            return name;
        }

        public int getGoals() {
            return goals;
        }

        @Override
        public String toString() {
            return getName() + ", goals " + getGoals();
        }
    }

    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        System.out.println("Total goals: " + barcelona.goals());
    }
}
