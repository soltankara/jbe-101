package MethodsHomework;

public class MethodsClasswork1 {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5));
    }
        public static int sum(int... numbers) {
            return sumRecursive(numbers, numbers.length - 1);
        }

        private static int sumRecursive(int[] numbers, int index) {
            if (index < 0) {
                return 0;
            } else {
                return numbers[index] + sumRecursive(numbers, index - 1);
            }
        }
    }

