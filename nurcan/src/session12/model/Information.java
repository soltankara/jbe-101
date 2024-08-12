package session12.model;

import java.time.Instant;
import java.time.LocalDate;

public class Information {
    Integer Id;
    String title;
    String description;
    LocalDate dueDate;
    InformationStatus status;
    Instant createdAt;
    public Information(Integer Id, String title, String description, LocalDate dueDate, InformationStatus status){
        this.Id=Id;
        this.title=title;
        this.description=description;
        this.dueDate=dueDate;
        this.status=status;
        this.createdAt=Instant.now();
    }

    public int getId() {
        return Id;
    }

    public InformationStatus getStatus() {
        return status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Information{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", status=" + status +
                ", createdAt=" + createdAt +
                '}';
    }
}
