package session17;

public class Medium {
    public static void main(String[] args) {
        //12. Integer to Roman
        int num = 3749;
        System.out.println("Int to roman: " + intToRoman(num));
        //167. Two Sum II - Input Array Is Sorted
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] arr=twoSum(numbers, target);
        System.out.println("Result: [" + arr[0] + ", " + arr[1] + "]");
        //213. House Robber II
        int[] nums={2,3,2};
        System.out.println("Max money: "+rob(nums));
    }

    public static String intToRoman(int num) {
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }
        return roman.toString();
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        throw new IllegalArgumentException("Not found!");
    }

    public static int rob(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        int rob1=robLinear(nums, 0, nums.length-2);
        int rob2=robLinear(nums, 1, nums.length-1);
        return Math.max(rob1, rob2);
    }

    public static int robLinear(int[] nums, int start, int end){
        int prev1=0, prev2=0;
        for(int i=start; i<=end; i++){
            int temp=Math.max(prev1, prev2+nums[i]);
            prev2=prev1;
            prev1=temp;
        }
        return prev1;
    }
}
