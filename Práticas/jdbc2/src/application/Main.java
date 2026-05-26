package application;

import db.DB;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String args[]) {
        Connection conn = null;
        PreparedStatement st = null;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement("INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS
            );

            st.setString(1, "José Machado");
            st.setString(2, "josemachado@gmail.com");
            st.setDate(3, java.sql.Date.valueOf(LocalDate.parse("18/05/1975", dtf)));
            st.setDouble(4, 2500.00);
            st.setInt(5, 2);

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet generatedKeys = st.getGeneratedKeys();

                while (generatedKeys.next()) {
                    System.out.println("Key generated: " + generatedKeys.getInt(1));
                }
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