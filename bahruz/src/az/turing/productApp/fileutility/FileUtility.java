package az.turing.productApp.fileutility;

import java.io.*;

public class FileUtility {

    //Obyekti fayla yazdirmaq (.obj)
    public static void writeObjectToFile(Serializable object, String name) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(name))) {
            oos.writeObject(object);
        }
        catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    //Object fayli oxumaq
    public static Object readObjectFromFile(String name) throws Exception {
        Object obj = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))) {
            obj = in.readObject();
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        } finally {
            return obj;
        }

    }
}
