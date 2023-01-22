package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    private List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        for (Student student : getStudents()) {
            if (student.getAverageGrade() == averageGrade) {
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        Student result = null;
        double maxValue = 0;
        for (Student student : getStudents()) {
            if (student.getAverageGrade() > maxValue) {
                result = student;
                maxValue = student.getAverageGrade();;
            }
        }
        return result;
    }

    public Student getStudentWithMinAverageGrade() {
        Student result = getStudents().get(0);
        double minValue = getStudents().get(0).getAverageGrade();
        for (Student student : getStudents()) {
            if (student.getAverageGrade() < minValue) {
                result = student;
                minValue = student.getAverageGrade();
            }
        }
        return result;
    }

    public void expel(Student student) {
        getStudents().remove(student);
    }
}