package com.skidmore.ariggs.fragmentargtest;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Andrew Riggs on 9/25/2017.
 */

public class CourseList {

    private static CourseList sCourseList;
    private List<Course> courses;

    public static CourseList get(Context context) {
        if (sCourseList == null) {
            sCourseList = new CourseList(context);
        }
        return sCourseList;
    }

    private CourseList(Context context) {
        courses = new ArrayList<>();
        courses.add(new Course());
    }

    public Course getCourse(UUID uuid) {
        for (Course course : courses) {
            if(course.getId().equals(uuid)) {
                return course;
            }
        }

        return null;
    }

    public Course getDemoCourse() {
        if (courses.get(0) != null) {
            return courses.get(0);
        }
        return null;
    }
}
