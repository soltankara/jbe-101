package session12CourseworkForHome.test;

import org.junit.Before;
import org.junit.Test;
import todoLesson.Entity.Task;
import todoLesson.enums.TaskStatus;
import todoLesson.service.impl.TaskManager;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class TaskManagerTest {
    private TaskManager taskManager;

    @Before
    public void setUp() {
        taskManager = new TaskManager(10);
    }

    @Test
    public void testAddValidTask() {
        //it was impossible to enter values from console, therefore i had to use inputStream to let system add informations automatically
        String input = "T1\nD1\nDONE\n2024-12-31\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        taskManager.add();

        Task[] tasks = taskManager.getTaskArray();

        assertNotNull("Task should be added successfully", tasks[0]);
        assertEquals("T1", tasks[0].getTitle());
        assertEquals("D1", tasks[0].getDescription());
        assertEquals(TaskStatus.DONE, tasks[0].getStatus());
        assertEquals(LocalDate.parse("2024-12-31"), tasks[0].getDueDate());
    }

    @Test
    public void testAddInvalidTitle() {
        String input = "\nD1\nDONE\n2024-12-31\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        taskManager.add();

        Task[] tasks = taskManager.getTaskArray();
        assertNull(tasks[0]);
    }

    @Test
    public void testAddInvalidDate() {
        String input = "T1\nD1\nDONE\n2024-42-55\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        taskManager.add();

        Task[] tasks = taskManager.getTaskArray();
        assertNull(tasks[0]);
    }

    @Test
    public void testRemoveExistingTask() {
        //Ignoring multiple removing scenario. Tests if the added element is being removed or not
        String inputAdd = "T1\nD1\nDONE\n2024-12-31\n";
        InputStream inAdd = new ByteArrayInputStream(inputAdd.getBytes());
        System.setIn(inAdd);
        taskManager.add();

        String inputRemove = "1\n";
        InputStream inRemove = new ByteArrayInputStream(inputRemove.getBytes());
        System.setIn(inRemove);
        taskManager.remove();

        Task[] tasks = taskManager.getTaskArray();
        assertNull(tasks[0]);
    }
}
