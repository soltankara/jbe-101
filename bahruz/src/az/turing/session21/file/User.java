package az.turing.session21.file;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID= 12L;
    public String name;
    public String surname;
    public int age;
    public transient String password;

    public int i;
    public int k;

}
