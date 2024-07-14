package session7;

public class Arrays14 {
    public static void main(String[] args) {
        String[] names = {"asa", "bbb", "ccc", "edd", "def"};
        String[] surnames = {"anna", "unna", "aaa", "bbb", "ccc", "ddd", "eee"};
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < surnames.length; j++) {
                if (names[i].equals(surnames[j])) {
                    System.out.println("Common element is: "  + names[i]);
                }
            }
        }
    }
}
