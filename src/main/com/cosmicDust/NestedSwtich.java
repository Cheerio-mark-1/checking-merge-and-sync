package main.com.cosmicDust;

public class NestedSwtich {
    public static void main(String[] args) {
        int empid = 2;
        String department = "Managment";

        switch (empid) {
            case 1 -> System.out.println("case 1");
            case 2 -> {
                System.out.println("case 2");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Managment" -> System.out.println("Managment Department");
                    default -> System.out.println("No Department Found");
                }
            }
            case 3 -> System.out.printf("case 3");
            default -> System.out.println("Please enter correct employee id");
        }

    }
}

