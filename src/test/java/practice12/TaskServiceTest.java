package practice12;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {
    @Test
    void testAddTask() {
        TaskService<String> service = new TaskService<>();
        Task<String> task = new Task<>("1", Task.Status.NEW, Task.Priority.HIGH, LocalDateTime.now());
        service.addTask(task);
        assertEquals(1, service.getAll().size());
    }

    @Test
    void testDuplicateTask() {
        TaskService<String> service = new TaskService<>();
        Task<String> task = new Task<>("1", Task.Status.NEW, Task.Priority.HIGH, LocalDateTime.now());
        service.addTask(task);
        assertThrows(IllegalArgumentException.class, () -> service.addTask(task));
    }

    @Test
    void testRemoveTask() {
        TaskService<String> service = new TaskService<>();
        Task<String> task = new Task<>("1", Task.Status.NEW, Task.Priority.HIGH, LocalDateTime.now());
        service.addTask(task);
        assertTrue(service.removeTaskById("1"));
        assertFalse(service.removeTaskById("1"));
    }

    @Test
    void testFilteredByStatus() {
        TaskService<String> service = new TaskService<>();
        service.addTask(new Task<>("1", Task.Status.NEW, Task.Priority.LOW, LocalDateTime.now()));
        service.addTask(new Task<>("2", Task.Status.DONE, Task.Priority.HIGH, LocalDateTime.now()));

        List<Task<String>> result = service.getTasksByStatus(Task.Status.NEW);
        assertEquals(1, result.size());
        assertEquals("1", result.get(0).getId());
    }

    @Test
    void testSortByDate() {
        TaskService<String> service = new TaskService<>();
        service.addTask(new Task<>("a", Task.Status.NEW, Task.Priority.MEDIUM, LocalDateTime.of(2021, 7, 7, 10, 0)));
        service.addTask(new Task<>("b", Task.Status.DONE, Task.Priority.MEDIUM, LocalDateTime.of(2020, 5, 9, 3, 0)));

        List<Task<String>> sorted = service.getTasksSortedByDate();
        assertEquals("b", sorted.get(0).getId());
    }



}
