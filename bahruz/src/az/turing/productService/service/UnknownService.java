package az.turing.productService.service;

public class UnknownService implements MenuService {
    @Override
    public void process() {
        System.out.println("Service not found!!!");
    }
}
