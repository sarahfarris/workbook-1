package Week_2;

public class Methods_2 {
    public static void main(String[] args) {
        String title = getPlayerTitle("Sarah");
        System.out.println("Title: " + title);
        doubleXP(5);
        hasLeveledUp(50, 40);
        boolean b1 = canOpenChest(true, true);
        boolean b2 = canOpenChest(false, false);
        boolean b3 = canOpenChest(true, false);
        boolean b4 = canOpenChest(false, true);
    }

    public static String getPlayerTitle(String name) {
        return "Princess " + name;
    }
    public static int doubleXP(int xp) {
        int doubleXP = xp * 2;
        System.out.println("Normal XP earned: " + xp);
        System.out.println("Double XP earned:  " + doubleXP);
        return doubleXP;
    }
    public static boolean hasLeveledUp(int currentXP, int threshold) {
        System.out.println("You leveled up!");
        return true;
        currentXP < threshold;
        System.out.println("Keep grinding...");
        return false;
    }
    public static boolean canOpenChest (boolean hasKey, boolean lockIsBroken) {
        return hasKey || lockIsBroken;
        }
    public static int addGold(int currentGold) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much gold did you find?");
        int goldFound = scanner.nextInt();

        if (goldFound > 100) {
            goldFound -= 0.1 * goldFound;
        }
        double total = currentGold + goldFound;
        System.out.println((goldFound + currentGold));
    }

}

