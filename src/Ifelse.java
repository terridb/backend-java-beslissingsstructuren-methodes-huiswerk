public class Ifelse {
    public static void main(String[] args) {
        checkEvenOrOdd(6);
        convertGrade(7);
        biggerNumber(9, 5);
        isPositiveNegativeZero(3);
        checkAge(19);
        checkLength("Lalalalala");
        isLeapYear(1800);
        biggestOfThree(2, 9, 1);
        triangle(4, 5, 1);
        System.out.println(calculator(5, 2, '/'));
    }

    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Het getal is even");
        } else {
            System.out.println("Het getal is oneven");
        }
    }

    public static void convertGrade(double grade) {
        String result;

        if (grade >= 9) {
            result = "A";
        } else if (grade >= 8) {
            result = "B";
        } else if (grade >= 7) {
            result = "C";
        } else if (grade >= 6) {
            result = "D";
        } else {
            result = "F";
        }

        System.out.println(result);
    }

    public static void biggerNumber(int a, int b) {
        if (a > b) {
            System.out.println(a + " is bigger than " + b);
        } else {
            System.out.println(a + " is smaller than " + b);
        }
    }

    public static void isPositiveNegativeZero(int a) {
        if (a > 0) {
            System.out.println("Number is positive");
        } else if (a == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is negative");
        }
    }

    public static void checkAge(int a) {
        if (a > 65) {
            System.out.println("Senior");
        } else if (a > 18) {
            System.out.println("Adult");
        } else if (a > 12) {
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }
    }

    public static void checkLength(String text) {
        if (text.length() <= 10) {
            System.out.println("Short text");
        } else if (text.length() >= 20) {
            System.out.println("Long text");
        } else {
            System.out.println("Medium length text");
        }
    }

    public static void isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Year is a leap year");
        } else {
            System.out.println("Year is not a leap year");
        }
    }

    public static void biggestOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is the biggest number");
        } else if (b > a && b > c) {
            System.out.println(b + " is the biggest number");
        } else {
            System.out.println(c + " is the biggest number");
        }
    }

    public static void triangle(int a, int b, int c) {
        if (a == b && a == c) {
            System.out.println("Gelijkzijdig");
        } else if (a != b && a != c && b != c) {
            System.out.println("Ongelijkzijdig");
        } else {
            System.out.println("Gelijkbenig");
        }
    }

    public static double calculator(int a, int b, char operator) {
        if (operator == '+') {
            return (a + b);
        } else if (operator == '-') {
            return (a - b);
        } else if (operator == '*') {
            return (a * b);
        } else {
            return ((double) a / b);
        }
    }
}
