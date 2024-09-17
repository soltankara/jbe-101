package az.turing.productService.service;

import az.turing.productService.data.Base;
import az.turing.productService.menu.MenuUtil;

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
