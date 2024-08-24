package collections;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

    }

    //-----Two pointers questions-----
    //75. Sort Colors
    public void sortColors(int[] nums) {
        int redPointer = 0;
        int current = 0;
        int bluePointer = nums.length - 1;

        while (current <= bluePointer) {
            if (nums[current] == 0) {
                int temp = nums[current];
                nums[current] = nums[redPointer];
                nums[redPointer] = temp;
                redPointer++;
                current++;
            } else if (nums[current] == 1) {
                current++;
            } else if (nums[current] == 2) {
                int temp = nums[current];
                nums[current] = nums[bluePointer];
                nums[bluePointer] = temp;
                bluePointer--;
            }
        }
    }

    //80. Remove Duplicates from Sorted Array II
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int newLength = 2;
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[newLength - 2]) {
                nums[newLength] = nums[i];
                newLength++;
            }
        }
        return newLength;
    }

    //88. Merge Sorted Array
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (i >= 0) {
            nums1[k--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    //457. Circular Array Loop
    //I could not solve this problem.

    //713. Subarray Product Less Than K
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int count = 0;
        int product = 1;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            product *= nums[end];

            while (product >= k) {
                product /= nums[start++];
            }

            count += end - start + 1;
        }
        return count;
    }

    //845. Longest Mountain in Array
    //I could not solve this problem.

    //904. Fruit Into Baskets
    public int totalFruits(int[] fruits) {
        Map<Integer, Integer> baskets = new HashMap<>();
        int left = 0, maxFruits = 0;
        for (int right = 0; right < fruits.length; right++) {
            baskets.put(fruits[right], baskets.getOrDefault(fruits[right], 0) + 1);

            while (baskets.size() > 2) {
                baskets.put(fruits[left], baskets.get(fruits[left]) - 1);
                if (baskets.get(fruits[left]) == 0) {
                    baskets.remove(fruits[left]);
                }
                left++;
            }
            maxFruits = Math.max(maxFruits, right - left + 1);
        }
        return maxFruits;
    }

    //925. Long Pressed Name
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
            } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }
            j++;
        }
        return i == name.length();
    }

    //986. Interval list intersections
    //I could not solve this problem.


    //-----HashMap questions-----
    //463 Island Perimeter
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    if (r == 0 || grid[r - 1][c] == 0) {
                        p++;
                    }
                    if (r == rows - 1 || grid[r + 1][c] == 0) {
                        p++;
                    }
                    if (c == 0 || grid[r][c - 1] == 0) {
                        p++;
                    }
                    if (c == cols - 1 || grid[r][c + 1] == 0) {
                        p++;
                    }
                }
            }
        }
        return p;
    }

    //535. Encode and Decode TinyURL
    //I could not solve this problem.

    //575. Distribute Candies
    public int distributeCandies(int[] candyType) {
        Map<Integer, Integer> candyCount = new HashMap<>();

        for (int candy : candyType) {
            candyCount.put(candy, candyCount.getOrDefault(candy, 0) + 1);
        }
        int uniqueCandyTypes = candyCount.size();
        int totalCandies = candyType.length;
        int maxCandiesPerPerson = totalCandies / 2;

        return Math.min(uniqueCandyTypes, maxCandiesPerPerson);
    }

    //739. Daily Temperature
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && temperatures[i] > temperatures[deque.peekLast()]) {
                int index = deque.removeLast();
                result[index] = i - index;
            }
            deque.addLast(i);
        }
        return result;
    }

    //748. Shortest Completing Word
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                char lowerChar = Character.toLowerCase(c);
                map.put(lowerChar, map.getOrDefault(lowerChar, 0) + 1);
            }
        }
        String shortestWord = null;
        for (String word : words) {
            if (isCompletingWord(word, map)) {
                if (shortestWord == null || word.length() < shortestWord.length()) {
                    shortestWord = word;
                }
            }
        }
        return shortestWord;
    }

    public boolean isCompletingWord(String word, Map<Character, Integer> plateCount) {
        Map<Character, Integer> wordMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : plateCount.entrySet()) {
            if (wordMap.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    //811. Subdomain Visit Count
    //I could not solve this problem

    //884. Uncommon Words from Two Sentences
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words1) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (String word : words2) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }

        return result.toArray(new String[0]);
    }

    //953. Verifying an Alien Dictionary
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            orderMap.put(order.charAt(i), i);
        }

        for (int i = 1; i < words.length; i++) {
            if (!isOrder(words[i - 1], words[i], orderMap)) {
                return false;
            }
        }
        return true;
    }

    private boolean isOrder(String word1, String word2, Map<Character, Integer> orderMap) {
        int len1 = word1.length(), len2 = word2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            if (c1 != c2) {
                return orderMap.get(c1) < orderMap.get(c2);
            }
        }
        return len1 <= len2;
    }

    //961. N-Repeated Element in Size 2N Array
    public int repeatedNTimes(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        throw new IllegalArgumentException("No element is repeated n times");
    }

    //1160. Find Words That Can Be Formed by Characters
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : chars.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        int totalLength = 0;
        for (String word : words) {
            Map<Character, Integer> wordCount = new HashMap<>();
            boolean flag = true;
            for (char c : word.toCharArray()) {
                wordCount.put(c, wordCount.getOrDefault(c, 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : wordCount.entrySet()) {
                if (charCount.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                totalLength += word.length();
            }
        }
        return totalLength;
    }

    //1078. Occurrences After Bigram
    public String[] findOcurrences(String text, String first, String second) {
        List<String> result = new ArrayList<>();
        String[] words = text.split(" ");

        for (int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)) {
                result.add(words[i + 2]);
            }
        }
        return result.toArray(new String[0]);
    }


    //-----String questions-----
    //468. Validate IP Address
    //I could not solve this problem.

    //522. Longest Uncommon Subsequence II
    //I could not solve this problem.

    //539. Minimum Time Difference
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutes = new ArrayList<>();
        for (String time : timePoints) {
            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int mins = Integer.parseInt(parts[1]);
            minutes.add(hours * 60 + mins);
        }

        Collections.sort(minutes);

        int minDiff = Integer.MAX_VALUE;
        int n = minutes.size();
        for (int i = 1; i < n; i++) {
            minDiff = Math.min(minDiff, minutes.get(i) - minutes.get(i - 1));
        }
        minDiff = Math.min(minDiff, 1440 - (minutes.get(n - 1) - minutes.get(0)));

        return minDiff;
    }

    //553. Optimal Division
    public String optimalDivision(int[] nums) {
        if (nums.length == 1) {
            return String.valueOf(nums[0]);
        }
        if (nums.length == 2) {
            return nums[0] + "/" + nums[1];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]).append("/(").append(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            sb.append("/").append(nums[i]);
        }
        sb.append(")");

        return sb.toString();
    }

    //791. Custom Sort String
    public String customSortString(String S, String T) {
        int[] count = new int[26];
        for (char c : T.toCharArray()) {
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            while (count[c - 'a']-- > 0) {
                sb.append(c);
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            while (count[c - 'a']-- > 0) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    //833. Find And Replace in String
    //I could not solve this problem.

    //835. Image overlap
    //I could not solve this problem.

    //893. Groups of Special-Equivalent Strings
    //I could not solve this problem.

    //1156. Swap For Longest Repeated Character Substring
    //I could not solve this problem.
}
