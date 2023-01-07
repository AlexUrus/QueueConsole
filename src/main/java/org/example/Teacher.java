package org.example;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    String name;
    String surname;

    List<Lesson> listTeachLessons;
    public Teacher(String name, String surname) {
        this.name = name;
        this.surname = surname;
        listTeachLessons = new ArrayList<>();
    }
    void addLesson(Lesson lesson){
        listTeachLessons.add(lesson);
    }
}
