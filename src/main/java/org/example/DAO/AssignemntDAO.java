package org.example.DAO;

import org.example.Model.assignments;
import org.example.Util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AssignemntDAO {
    public static void addAssignment(assignments a) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO assignments(student_id, title, score) VALUES (?, ?, ?)");
        ps.setInt(1, a.getStudentId());
        ps.setInt(3, a.getScore());
        ps.executeUpdate();
        con.close();
    }

    // Get all assignments for a student
    public static List<assignments> getAssignmentsByStudent(int studentId) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT * FROM assignments WHERE student_id=?");
        ps.setInt(1, studentId);
        ResultSet rs = ps.executeQuery();
        List<assignments> list = new ArrayList<>();
        while (rs.next()) {
            list.add(new assignments(
                    rs.getInt("id"),
                    rs.getInt("student_id"),
                    //rs.getString("title"),
                    rs.getInt("score")
            ));
        }
        con.close();
        return list;
    }

    // Update assignment score
    public static void updateScore(int assignmentId, int score) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE assignments SET score=? WHERE id=?");
        ps.setInt(1, score);
        ps.setInt(2, assignmentId);
        ps.executeUpdate();
        con.close();
    }

    // Delete assignment
    public static void deleteAssignment(int assignmentId) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("DELETE FROM assignments WHERE id=?");
        ps.setInt(1, assignmentId);
        ps.executeUpdate();
        con.close();
    }
}
