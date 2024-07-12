package session6;

public class Zero {
    public static void main(String[] args) {
        int[] array = {1, 0, 8, 3, 4, 5, 0, 2, 4, 0, 2, 3};

        int[] result = zeros(array);

        for (int num : result) System.out.print(num + " ");
    }

    public static int[] zeros(int[] array) {
        int[] result = new int[array.length];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                result[index] = array[i];
                index++;
            }
        }
        return result;
    }
}

