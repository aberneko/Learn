package com.aberneko.learning.Enum.TaskEnumOne;

public class Task {

    TaskPriority priority; // добавьте переменную priority с приоритетом задачи
    private String description;

    public Task(TaskPriority priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public TaskPriority getPriority() {
        return priority;
    }// добавьте метод get для приоритета

    public String getDescription() {
        return description;
    }
}