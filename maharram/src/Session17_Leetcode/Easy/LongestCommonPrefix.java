//14. Longest Common Prefix
package Session17_Leetcode.Easy;
public class LongestCommonPrefix {
    public String findLongestPrefix(String[] array) {
        String prefix = array[0];
        for (int i = 1; i < array.length; i++) {
            while (array[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String[] array2 = {"bosss", "boss", "bos"};
        System.out.println(obj.findLongestPrefix(array2));
    }
}
