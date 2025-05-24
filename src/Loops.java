public class Loops {
    public static void main(String[] args) {

//        Opdracht 1
        int result1 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                result1 += i;
            }
        }
        System.out.println(result1);

//        Opdracht 2
        int index2 = 1;
        while (index2 <= 1000) {
            index2 = index2 * 2;
            System.out.println(index2);
        }

//        Opdracht 3
        int[] numbers3 = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};
        int counter3 = 0;
        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] == 45) {
                counter3++;
            }
        }
        System.out.println(counter3 > 0);

//        Opdracht 4
        int[] numbers4 = {12, 5, 7, 2, 18, 3, 9, 12};
        int result4 = 0;
        for (int i = 0; i < numbers4.length; i++) {
            result4 += numbers4[i];
        }
        System.out.println(result4);

//        Opdracht 5
        String[] words5 = {"Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren", "", "Deze", "student", "haalde", "goede", "cijfers"};
        for (int i = 0; i < words5.length; i++) {
            System.out.println(words5[i]);
            if (words5[i].isEmpty()) {
                break;
            }
        }

//        Opdracht 6
        int memory6 = 0;

        for (int i = 2; i <= 100; i++) {
            if (i % 2 != 0 || i == 2) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        memory6++;
                    }
                }
                if (memory6 == 0) {
                    System.out.println(i);
                }
                memory6 = 0;
            } else {
                continue;
            }
        }

//        Opdracht 7
        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] >= 45) {
                System.out.println(numbers3[i]);
            }
        }

//        Opdracht 8
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

//        Opdracht 9
        int first = 0;
        int second = 1;
        int tempFirst = 0;
        int tempSecond = 0;

        for (int i = 0; i <= 8; i++) {
            if (i == 0) {
                System.out.println(first);
                System.out.println(second);
            } else if (i % 2 != 0) {
                System.out.println(first + second);
                tempFirst = second;
                tempSecond = first + second;
            } else if (i % 2 == 0) {
                System.out.println(tempFirst + tempSecond);
                first = tempSecond;
                second = tempFirst + tempSecond;
            }
        }
    }
}
