package org.example;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Татьяна","Зайцева");
        Lesson lesson = new Lesson("ggg","14.20 11.1.2001", "14.50 12.1.2001");
        Lesson lesson1 = new Lesson("ggg","14.20 11.1.2001", "14.50 12.1.2001");
        teacher.addLesson(lesson);
        Student student = new Student("Urusov", "Bist-211");
        teacher.listTeachLessons.get(0).queueStudent.addInQueue(student);

    }
}