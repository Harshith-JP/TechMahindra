import java.sql.*;

public class Task1 {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/schoolDB";
        String dbUser = "root";
        String dbPassword = "root";

        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String insertQuery = "INSERT INTO students (name, age) VALUES (?, ?)";
            try (PreparedStatement insertStatement = connection.prepareStatement(insertQuery)) {
                insertStatement.setString(1, "Ravi");
                insertStatement.setInt(2, 21);
                insertStatement.executeUpdate();
                System.out.println("New student inserted successfully!");
            }

            String selectQuery = "SELECT * FROM students";
            try (Statement selectStatement = connection.createStatement();
                 ResultSet resultSet = selectStatement.executeQuery(selectQuery)) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    System.out.println("Student ID: " + id + ", Name: " + name + ", Age: " + age);
                }
            }

            String updateQuery = "UPDATE students SET age = ? WHERE name = ?";
            try (PreparedStatement updateStatement = connection.prepareStatement(updateQuery)) {
                updateStatement.setInt(1, 22);
                updateStatement.setString(2, "Vijay");
                int updatedRows = updateStatement.executeUpdate();
                System.out.println(updatedRows > 0 ? "Student age updated successfully!" : "No student found with the name 'Vijay'.");
            }

            String deleteQuery = "DELETE FROM students WHERE name = ?";
            try (PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery)) {
                deleteStatement.setString(1, "Karan");
                int deletedRows = deleteStatement.executeUpdate();
                System.out.println(deletedRows > 0 ? "Student deleted successfully!" : "No student found with the name 'Karan'.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
