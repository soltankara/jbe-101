package Module02.Session22;

import java.io.*;

public class Classwork {
    public static void main(String[] args) {
        String FILEPATH = "adil/src/Module02/Session22/user.txt";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILEPATH))) {
            oos.writeObject(User.of("Adil", "Ismayilov", "adiliso"
                    , "1234"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILEPATH))) {
            User user = (User) ois.readObject();
            System.out.println(user);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
