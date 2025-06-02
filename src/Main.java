public class Main {
    public static void main(String[] args) {
        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";

        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        bartender(name);
        sum(input1, input2);
    }

    public static void hello() {
        System.out.println("Hello, world!");
    }

    public static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void positiveOrZeroOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number < 0) {
            System.out.println("This number is negative!");
        } else {
            System.out.println("This number is zero!");
        }
    }


    public static void bartender(String name) {
        String drink = switch (name) {
            case "Henk" -> "Bacardi Cola";
            case "Simone" -> "Gin Tonic";
            case "Barrie" -> "Moscow Mule";
            default -> {
                System.out.println("This name is unknown. Try Henk, Simone or Barrie.");
                yield null;
            }
        };
        if (drink != null) {
            System.out.println(name + " wants a " + drink);
        }
    }

    public static void sum(int input1, int input2) {
        System.out.println(input1 + input2);
    }
}



