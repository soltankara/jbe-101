import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StulNomresi {
    public static void main(String[] args) {
        String[] sagirdler = {"Muhammed", "Huseyn", "Leyla", "Ali",
                "Bahruz", "Turqut", "Shammad", "Aysel", "Nurcan", "Javad", "Saleh",
        "Maharram", "Elshan" , "Araz" , "Adil", "AnarF", "Royal" , "Omar" , "AnarK",
                "Ayten" , "Joshgun" , "Kanan", "Farid", "Hikmat", "Ilkin"};
        int sagirdSayi = sagirdler.length;

        List<String> listOfStudents = Arrays.asList(sagirdler);
        Collections.shuffle(listOfStudents);

        for (int i = 0; i < sagirdSayi; i++) {
            System.out.println(listOfStudents.get(i) + " - yer " + (i+1) );
        }


    }

}
