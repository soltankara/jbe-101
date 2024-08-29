package az.turing.session19;

import java.io.*;

public class FileReadAndWrite {

    //Obyekti fayla yazdirmaq (.obj)

    public static void writeObjectToFile(Serializable object, String name) throws Exception {
        try (FileOutputStream fout = new FileOutputStream(name);
             ObjectOutputStream oos = new ObjectOutputStream(fout);) {
            oos.writeObject(object);
        }
    }
//Object fayli oxumaq


    public static Object readObjectFromFile(String name) throws Exception {
        Object obj = null;
        try (FileInputStream ft = new FileInputStream(name);
             ObjectInputStream in = new ObjectInputStream(ft)) {
            obj = in.readObject();
        }
        return obj;
    }

}
