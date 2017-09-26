package com.skidmore.ariggs.fragmentargtest;

import java.util.UUID;

/**
 * Created by ariggs on 9/25/17.
 */

public class Course {

    private UUID id;
    private String name;

    public Course() {
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
