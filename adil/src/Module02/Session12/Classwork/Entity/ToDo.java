package Module02.Session12.Classwork.Entity;

import Module02.Session12.Classwork.Model.ToDoStatus;

import java.time.Instant;
import java.time.LocalDate;

public class ToDo {
    private int id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private ToDoStatus status;
    private Instant createdAt;
    private static int k = 1;

    public ToDo(String title, String description, LocalDate dueDate, ToDoStatus status) {
        this.id = k++;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.title = title;
        this.createdAt = Instant.now();
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public int getId() {
        return id;
    }

    public ToDoStatus getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", status=" + status + ", " +
                "createdAt=" + createdAt +
                '}';
    }
}
