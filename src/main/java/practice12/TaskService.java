package practice12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService <T> {
    private final List<Task<T>> tasks = new ArrayList<>();

    public synchronized void addTask(Task<T> task) {
        boolean exists = tasks.stream().anyMatch(t -> t.getId().equals(task.getId()));
        if (exists) {
            throw new IllegalArgumentException("Задача с таким ID уже существует!");
        }
        tasks.add(task);
    }

    public synchronized boolean removeTaskById(T id) {
        return tasks.removeIf(t -> t.getId().equals(id));
    }

    public synchronized List<Task<T>> getTasksByStatus(Task.Status status) {
        return tasks.stream()
                .filter(t -> t.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    public synchronized List<Task<T>> getTasksSortedByDate() {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getDate))
                .collect(Collectors.toList());
    }


    public List<Task<T>> getAll() {
        return List.copyOf(tasks);
    }
}
