package session12CourseworkForHome.todoLesson.service.impl;

import session12CourseworkForHome.todoLesson.Entity.Task;
import session12CourseworkForHome.todoLesson.enums.TaskStatus;
import session12CourseworkForHome.todoLesson.service.ITaskManager;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TaskManager implements ITaskManager {
    private Task[] taskArray;
    private int taskCount = 0;
    private int idGenerator = 1;

    public TaskManager(int size) {
        this.taskArray = new Task[size];
    }

    @Override
    public void add() {
        if (taskCount > (taskArray.length - 1)) {
            System.out.println("To-Do Tasks does not have enough space to add another task. Please remove some task.");
            return;
        }

        Scanner taskScanner = new Scanner(System.in);

        System.out.print("Title: ");
        String title = taskScanner.nextLine();
        if (title.isBlank()) {
            System.out.println("Incorrect title. Reverting back to menu");
            return;
        }

        System.out.print("Description: ");
        String description = taskScanner.nextLine();
        if (description.isBlank()) {
            System.out.println("Incorrect description. Reverting back to menu");
            return;
        }


        System.out.print("Status: ");
        String status = taskScanner.nextLine();
        TaskStatus taskStatus;
        try {
            taskStatus = TaskStatus.fromValue(status);
        }catch (IllegalArgumentException e){
            System.out.println("Incorrect status. Reverting back to menu");
            return;
        }
//        if (taskStatus == null) {
//            System.out.println("Incorrect status. Reverting back to menu");
//            return;
//        }

        System.out.print("Due date: ");
        String dueDate = taskScanner.nextLine();
        LocalDate parsedDueDate = null;
        try {
            parsedDueDate = LocalDate.parse(dueDate);
        } catch (DateTimeParseException e) {
            System.out.println("Incorrect date. Reverting back to menu");
            return;
        }

        Task taskToSave = new Task(idGenerator, title, description, taskStatus, parsedDueDate);

        taskArray[taskCount] = taskToSave;
        idGenerator++;
        taskCount++;
    }

    @Override
    public void remove() {
        Scanner removeScanner = new Scanner(System.in);
        System.out.print("Enter ID of task to remove: ");
        Integer id = removeScanner.nextInt();

        boolean exists = false;

        for (int i = 0; i < taskCount; i++) {
            if (taskArray[i].getId().equals(id)) {
                exists = true;

                for (int j = i; j < taskCount - 1; j++) {
                    taskArray[j] = taskArray[j + 1];
                }
                taskArray[taskCount - 1] = null;
                taskCount--;
                break;
            }
        }
        System.out.println((exists) ? "Element removed." : "Element does not exists.");
    }

    @Override
    public void printAll() {
        for (int i = 0; i < taskCount; i++) {
            Task task = taskArray[i];
            String prefix = TaskStatus.isDone(task.getStatus()) ? "[x]" : "[ ]";
            System.out.printf("%s %s \n", prefix, task);
        }
    }

    public Task[] getTaskArray() {
        return taskArray;
    }
}
