package org.example.Model;

public class students {
    private int id;
    private String name;
    private int age;
    private String grade;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "students{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public students(String name,int age, String grade) {
        this.age = age;
        this.grade = grade;
        this.name = name;
    }
    public students(){}

    public students(int age, String grade, int id, String name) {
        this.age = age;
        this.grade = grade;
        this.id = id;
        this.name = name;
    }
}
