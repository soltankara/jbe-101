package Module02.Session21.Classwork;

import java.io.*;

public class Classwork {
    public static void main(String[] args) {
        String ROOT = "adil/src/Module02/Session21/";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(ROOT + "classwork.txt"))) {
            writer.write("This is a classwork file.\n");
            writer.write("This is a classwork file.\n");
        }catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(ROOT + "classwork.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
