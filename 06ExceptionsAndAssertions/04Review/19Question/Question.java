import java.io.*;
import java.sql.*;
public class Question {
    public void read() throws SQLException {
        try {
            readFromDatabase();
        //} catch(Exception e) {
        //} catch(RuntimeEception e) {
        //} catch(SQLException e) {
        //} catch(SQLException | IOException e) { // Does not declare IOException to throw
        } catch(SQLException | RuntimeException e) {
            throw e;
        }
    }
    private static void readFromDatabase() throws SQLException {}
    public static void main(String[] args) {}
}
