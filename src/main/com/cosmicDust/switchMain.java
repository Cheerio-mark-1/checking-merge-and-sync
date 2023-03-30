package main.com.cosmicDust;

public class switchMain {
    public static void main(String[] args) {
        String fruit = "mango";
        int day = 3;
        switch (fruit) {
            case "jackfruit" -> System.out.println("JackFruit");
            case "apple" -> System.out.println("mongo");
            case "mango" -> System.out.println("king of apples");
            case "grapes" -> System.out.println("Grapes Round Fruit");
            default -> System.out.println("not Fruit");
        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Holiday");
            default -> System.out.printf("Not week day ");
        }
    }
}
