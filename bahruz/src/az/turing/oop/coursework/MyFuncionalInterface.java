package az.turing.oop.coursework;

@FunctionalInterface
public interface MyFuncionalInterface {

    void myMethod();

    default void defaultMethod() {
        System.out.println("Default method");
    }

    static void staticMethod() {
        System.out.println("Static  method");
    }

}
