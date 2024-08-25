package session12.service;

import Information.model.Information;
import Information.model.InformationStatus;

public interface InformationService {
    void add();

    void remove();

    Information[] findAll();

    default void printAll() {
        for (Information inf : findAll()) {
            if (inf != null) {
                String icon = InformationStatus.isDone(inf.getStatus())
                        ? "[x]"
                        : "[ ]";
                System.out.printf("%s %s\n", icon, inf);
            }
        }
    }
}
