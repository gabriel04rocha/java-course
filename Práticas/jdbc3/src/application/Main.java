package application;

import db.DB;

import java.sql.*;
import java.time.LocalDate;

public class Main {
    public static void main(String args[]) {
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "UPDATE seller "
                    + "SET BaseSalary = BaseSalary + ? "
                    + "WHERE (DepartmentId = ?)"
            );

            st.setDouble(1, 200);
            st.setInt(2, 2);

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Done! Rows affected: " + rowsAffected);
            } else {
                System.out.println("No rows were affected!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

        DB.closeConnection();
    }
}