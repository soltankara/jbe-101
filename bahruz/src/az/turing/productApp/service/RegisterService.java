package az.turing.productApp.service;

import az.turing.productApp.data.Base;
import az.turing.productApp.menu.MenuUtil;

import java.util.HashMap;

public class RegisterService implements MenuService {
    @Override
    public void process() {
        String userName = MenuUtil.getText("Enter the username");
        String password = MenuUtil.getText("Enter the password");
        if (Base.instance().getUsers().containsKey(userName)) {
            System.out.println("This username already exits!");
            process();
        }

        Base.instance().setUsers(userName,password);
        Base.save();


    }
}
