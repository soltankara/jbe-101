package session5;

public class Methods3 {
    public static void main(String[] args) {
        System.out.println(reverse("Reverse me"));

    }
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
    private void assertEquals(String reverseMe) {
    }
}
