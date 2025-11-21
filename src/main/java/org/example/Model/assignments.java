package org.example.Model;

public class assignments {
    private int id;
    private int studentId;
    private String assignmentName;
    private int score;

public assignments(){}
    public assignments(String assignmentName, int id, int score, int studentId) {
        this.assignmentName = assignmentName;
        this.id = id;
        this.score = score;
        this.studentId = studentId;
    }

    public assignments(int id, int studentId, int score) {
    this.id=id;
    this.studentId=studentId;
   this.score=score;
    }

    public assignments(int studentId, int score) {
    this.score=score;
    this.studentId=studentId;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "assignments{" +
                "assignmentName='" + assignmentName + '\'' +
                ", id=" + id +
                ", studentId=" + studentId +
                ", score=" + score +
                '}';
    }
}
