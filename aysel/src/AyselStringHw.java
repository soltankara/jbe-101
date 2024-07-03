public class AyselStringHw {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        // ilk muqayisede yaradilan her iki deyisen eyni bir obyekte isare edir.Buna gore de onlar muqayise edilerken true neticesi alinir.
        //Ikinci muqayisede ise new emri ile yeni string obyekti yaradilir ve heap yaddasinda saxlanilir.Mezmunca evvelki iki deyisenle eyni(Hello) olsa da,str3 deyiseni heap yaddasdaki yeni obyekte referans edir.
        //Eger equals() metodundan istifade ederek muqayise etseydik true emrini alacaqdiq.cunki equals() metodu obyektlerin mezmununu muqayise edir,referanslarini deyil.

    }
}
