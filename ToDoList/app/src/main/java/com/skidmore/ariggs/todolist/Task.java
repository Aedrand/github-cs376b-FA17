package com.skidmore.ariggs.todolist;

import java.util.Date;

/**
 * Created by ariggs on 9/22/17.
 */

public class Task {

    private String name;
    private String description;
    private Date dueDate;
    private Date completionDate;
    private Boolean completed;

    public Task(String name, String description, Date dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.completionDate = null;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
