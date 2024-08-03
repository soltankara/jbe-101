package az.perfect.oop.application.bean;

public class Todo {

    private Integer id;

    private String title;
    private String description;
    private String date;
    private String status;

    public Todo(String title, String description, String date, String status) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Application: " + "title: " + title + " ,description: " + description + " ,date='" + date + ", status='" + status;

    }
}
