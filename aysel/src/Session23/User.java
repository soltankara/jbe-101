package aysel.src.Session23;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String surName;
    private  String userName;
    private String password;

    public User(String name, String surName, String userName, String password) {
        this.name = name;
        this.surName = surName;
        this.userName = userName;
        this.password = password;
    }

    public static User of(String name, String surname, String username, String password) {
        return new User(name, surname, username, password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

