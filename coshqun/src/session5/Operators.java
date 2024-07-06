package session5;

public class Operators {
    public static void main(String[] args){
        int a = 10;
        int b = 6;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.println(a==b);  //false
        System.out.println(a!=b);  //true
        System.out.println(a>b);  //true
        System.out.println(a<b);  //false
        System.out.println(a>=b);  //true
        System.out.println(a<=b);  //false

        /*The reason the first result is true, Because str1 is already in the String Pool,
        so the comparison with str2 returns true. Second,
        even though str1 is in the String Pool, str3 defines a new object.
        Therefore, the comparison of str1 and str3 returns false.*/
    }
}
