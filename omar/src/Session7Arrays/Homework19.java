package Session7Arrays;

public class Homework19 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 4, 4, 4, 6, 4, 6, 2, 4};
        int n = arr.length;

        // Variable to store the majority element
        int candidate = -1;
        int count = 0;

        // Find the candidate for majority element using Moore's Voting Algorithm
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Verify the candidate is actually the majority element
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        // Print the result
        if (count > n / 2) {
            System.out.println("The majority element is: " + candidate);
        } else {
            System.out.println("There is no majority element.");
        }
    }
}
