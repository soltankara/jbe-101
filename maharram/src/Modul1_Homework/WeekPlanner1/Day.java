package Modul1_Homework.WeekPlanner1;
public class Day {
    private String name;
    private String tasks;

    public Day(String name, String tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }
}
