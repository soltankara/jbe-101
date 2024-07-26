import java.time.LocalTime;

public class AirplainMain {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("BaIs101", "Istanbul", LocalTime.of(14, 30, 0));
        Airplane airplane2 = new Airplane("BaMo101", "Moscow", LocalTime.of(16, 45, 0));

        System.out.println("Check flight status : ");
        airplane1.check();
        airplane2.check();

        airplane1.delay(15);
        airplane2.delay(40);

        System.out.println("Check new flight status : ");
        airplane1.check();
        airplane2.check();
    }
}
