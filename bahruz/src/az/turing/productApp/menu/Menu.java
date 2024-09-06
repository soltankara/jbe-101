package az.turing.productApp.menu;

import az.turing.productApp.service.*;

public enum Menu {
    LOGİN(1, "Login", new LoginService()),
    REGİSTER(2, "Register", new RegisterService()),
    ADDPRODUCT(3, "AddProduct", new AddProductService()),
    SHOWPRODUCT(4, "ShowProduct", new ShowProductService()),
    FINDPRODUCT(5, "FindProduct", new FindProductService()),
    DELETEPRODUCT(6, "DeleteProduct", new DeleteProductService()),
    EXIT(7, "Exit", new ExitService()),
    UNKNOWN(new UnknownService());
    private Integer number;
    private String text;
    private MenuService menuService;

    Menu(Integer number, String text, MenuService menuService) {
        this.number = number;
        this.text = text;
        this.menuService = menuService;
    }

    Menu(MenuService menuService) {
        this.menuService = menuService;
    }

    public void enumProsess() {
        menuService.process();
        MenuUtil.startMenu();
    }

    public static Menu findMenuforNumber(Integer number) {
        Menu menu[] = Menu.values();
        for (Menu m : menu) {
            if (m.number == number) {
                return m;
            }
        }
        return Menu.UNKNOWN;

    }

    @Override
    public String toString() {
        return number + "." + text;
    }
}
