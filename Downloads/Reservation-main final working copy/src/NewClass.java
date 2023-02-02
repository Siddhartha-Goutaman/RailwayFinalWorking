/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author siddharthagoutaman
 */
import java.sql.*;
public class NewClass {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
            Statement st = con.createStatement();
            String city = "Thrissur";
            String s="select sno from traindet where train1 = '" + city +"'";
            ResultSet rs = st.executeQuery(s);
            if(rs.next()){
                System.out.println(rs.getString(1));
            }
            con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
