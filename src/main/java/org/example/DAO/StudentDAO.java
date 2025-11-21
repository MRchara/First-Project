package org.example.DAO;

import org.example.Model.students;
import org.example.Util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public void  add(students s) throws Exception{
        Connection dbConnection=DBConnection.getConnection();
        PreparedStatement ps=dbConnection.prepareStatement("INSERT INTO students(name,age,grade) VALUES (?,?,?)");
        ps.setString(1,s.getName());
        ps.setInt(2, s.getAge());
        ps.setString(3,s.getGrade());
        ps.executeUpdate();
        dbConnection.close();
    }
 public  List<students>getall() throws Exception{
        Connection connection=DBConnection.getConnection();
     Statement statement=connection.createStatement();
     ResultSet rs=statement.executeQuery("SELECT * FROM students");
        List<students>get=new ArrayList<>();
        while (rs.next()){
            get.add(new students(
                    rs.getInt("Id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("grade")
            ));
        }
        connection.close();
        return get;
 }
 public void deletebyId(int id)throws  Exception {
     Connection connection = DBConnection.getConnection();
     PreparedStatement ps = connection.prepareStatement("DELETE FROM students WHERE id=?");
     ps.setInt(1, id);
     ps.executeUpdate();
     connection.close();

 }
 public void  update(int id,String name,int age,String grade)throws Exception {
     Connection connection = DBConnection.getConnection();
     PreparedStatement preparedStatement = connection.prepareStatement("UPDATE students SET name=?, age=?, grade=? WHERE id=?");
     preparedStatement.setString(1, name);
     preparedStatement.setInt(2, age);
     preparedStatement.setString(3, grade);
     preparedStatement.executeUpdate();
     connection.close();
 }
 public void DeleteAll()throws Exception{
        Connection connection=DBConnection.getConnection();
        Statement st=connection.createStatement();
        st.executeUpdate("DELETE FROM students");
        connection.close();
 }


}
