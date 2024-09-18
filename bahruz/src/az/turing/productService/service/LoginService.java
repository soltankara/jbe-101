package az.turing.productService.service;

import az.turing.productService.data.Base;
import az.turing.productService.menu.MenuUtil;

public class LoginService implements MenuService {
    @Override
    public void process() {
        try {
            String login = MenuUtil.getText("Username");
            String password = MenuUtil.getText("Password");
            if (!(Base.instance().getUsers().containsKey(login) && Base.instance().getUsers().get(login).equals(password))) {
                Base.logeddin = false;
                throw new IllegalArgumentException("Username or password Invalide!");
            }
            Base.logeddin = true;
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
        }


    }
}
