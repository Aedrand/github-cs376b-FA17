package com.skidmore.ariggs.fragmentargtest;

import java.util.UUID;

/**
 * Created by ariggs on 9/25/17.
 */

public class Course {

    private UUID id;
    private String name;
    private String department;

    public Course() {
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
