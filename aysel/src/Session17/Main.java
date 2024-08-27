package aysel.src.Session17;

public class Main {
    public static void main(String[] args) {
        //1
        LeetCodeHW solution = new LeetCodeHW();
        int[] nums = {2, 7, 11, 15};
        int target = 18;

        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);

        //2
        LeetCodeHW converter = new LeetCodeHW();
        String romanNumber = "MCMXCIV";
        int result1 = converter.romanToInt(romanNumber);
        System.out.println("The integer value of " + romanNumber + " is " + result1);


        //3
        LeetCodeHW rd = new LeetCodeHW();

        int[] nums1 = {1, 1, 2, 2, 3, 4, 4};
        int k = rd.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        //4
        int[] numss = {1, 3, 5, 6};
        int target1 = 2;
        int result2 = LeetCodeHW.searchInsert(nums, target1);
        System.out.println("Result: " + result2);


        //5
        int[] nums2 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums3 = {2, 5, 6};
        int n = 3;

        LeetCodeHW.merge(nums2, m, nums3, n);


        System.out.print("Merged array: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }

        //6
        LeetCodeHW ri = new LeetCodeHW();
        int x1 = 123;
        int x2 = -123;
        int x3 = 1534236469;

        System.out.println("Reversed x1: " + ri.reverse(x1));
        System.out.println("Reversed x2: " + ri.reverse(x2));
        System.out.println("Reversed x3: " + ri.reverse(x3));


        //7
        LeetCodeHW converter1 = new LeetCodeHW();
        int number = 1994;
        System.out.println("Roman numeral for " + number + " is: " + converter1.intToRoman(number));


        //8
        LeetCodeHW pf = new LeetCodeHW();
        double x = 2.0;
        int n1 = 10;
        System.out.println("Result: " + pf.myPow(x, n1));

        //9
        LeetCodeHW solution1 = new LeetCodeHW();
        int[] nums1a = {1, 3};
        int[] nums2a = {2};
        System.out.println("The median is: " + solution1.findMedianSortedArrays(nums1a, nums2a));

        int[] nums1b = {1, 2};
        int[] nums2b = {3, 4};
        System.out.println("The median is: " + solution1.findMedianSortedArrays(nums1b, nums2b));


    }
}
