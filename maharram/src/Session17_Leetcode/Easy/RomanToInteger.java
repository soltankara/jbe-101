//13. Roman to Integer
package Session17_Leetcode.Easy;
import java.util.HashMap;
import java.util.Map;
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        Integer total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                total -= map.get(s.charAt(i));
            } else {
                total += map.get(s.charAt(i));
            }
        }
        return total;
    }

    public static void main(String[] args) {
        RomanToInteger obj = new RomanToInteger();
        System.out.println(obj.romanToInt("XI"));
        System.out.println(obj.romanToInt("IX"));
        System.out.println(obj.romanToInt("XVI"));
        System.out.println(obj.romanToInt("IV"));
        System.out.println(obj.romanToInt("XX"));
    }
}
