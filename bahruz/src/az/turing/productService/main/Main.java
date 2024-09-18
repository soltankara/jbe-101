package az.turing.productService.main;

import az.turing.productService.data.Base;
import az.turing.productService.menu.MenuUtil;

public class Main {
    public static void main(String[] args) {

        Base.initialize();
        MenuUtil.startMenu();
    }
}
