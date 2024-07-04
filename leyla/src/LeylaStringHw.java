public class LeylaStringHw {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        /*Birincide str1 ve str2 eyni obyekte istinad edir,bunun sayesinde jvm yeni string
        obyekti yaratmagina ehtiyac qalmayacaq pooldakindan istifade edir.str3de ise
        yeni string obyekti yaradilib yuxaridaki ikisi ile eyni deyil*/
    }
}
