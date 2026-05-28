package application;

import db.DB;
import db.DbIntegrityException;

import java.sql.*;
import java.time.LocalDate;

public class Main {
    public static void main(String args[]) {
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "DELETE FROM seller "
                    + "WHERE DepartmentId = ? "
            );

            st.setInt(1, 2);
            st.setInt(2, 2);

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Done! Rows affected: " + rowsAffected);
            } else {
                System.out.println("No rows were affected!");
            }

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

        DB.closeConnection();
    }
}