package az.turing.session21.file;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileUtility {
//Stringi .txt fayla yazmaq ucun metod

    public static void writeIntoFile(String filename, String text) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename));) {
            bw.write(text);
        }
    }
//.txt fayldan Stringi oxumaq

    public static String readFromFile(String filename) throws IOException {
        try (InputStream in = new FileInputStream(filename);
             InputStreamReader r = new InputStreamReader(in);
             BufferedReader reader = new BufferedReader(r);) {
            String line = null;
            String result = "";
            while ((line = reader.readLine()) != null) {
                result = result + line + "\n";
            };
            return result;
        }

    }
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

        FileInputStream ft = new FileInputStream(name);

        try (ObjectInputStream in = new ObjectInputStream(ft)) {
            obj = in.readObject();
        } finally {
            return obj;
        }

    }
//.byte lari oxumaq >> meselen  .png fayli   (NIO FILE)

    public static byte[] NIOreadBytes(String fileName) throws Exception {
        Path filePath = Paths.get(fileName);
        byte[] byteArray = Files.readAllBytes(filePath);
        return byteArray;
    }

    //.byte lari yazdirmaq >> meselen  .png fayli (NIO FILE)
    public static void NIOwriteBytes(byte[] data, String fileName) throws Exception {
        Path filePath = Paths.get(fileName);
        Files.write(filePath, data);

    }

    //.byte lari oxumaq >> meselen  .png fayli   (IO FILE)
    public static byte[] readBytes(String fileName) throws Exception {
        File fi = new File(fileName);

        try (FileInputStream fis = new FileInputStream(fi);) {
            byte[] byteArray = new byte[(int) fi.length()];
            fis.read(byteArray);
            return byteArray;
        } catch (Exception ex) {
            return null;
        }
    }

    //.byte lari yazmaq >> meselen  .png fayli   (IO FILE)
    public static void writeBytes(String fileName, byte[] data) throws Exception {
        try (FileOutputStream fops = new FileOutputStream(fileName);) {
            fops.write(data);
        }

    }

}

