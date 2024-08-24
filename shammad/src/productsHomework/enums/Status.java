package productsHomework.enums;

public enum Status {
    ACTIVE, INACTIVE;

    public static boolean isInactive(Status ts) {
        return ts == INACTIVE;
    }
}
