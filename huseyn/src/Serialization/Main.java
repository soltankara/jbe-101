package Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (ObjectOutputStream ostr = new ObjectOutputStream(new FileOutputStream("huseyn.txt"))) {
            ostr.writeObject(User.of("Huseyn", "Heydarli", "husss"
                    , "1903"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream istr = new ObjectInputStream(new FileInputStream("huseyn.txt"))) {
            User user = (User) istr.readObject();
            System.out.println(user);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}