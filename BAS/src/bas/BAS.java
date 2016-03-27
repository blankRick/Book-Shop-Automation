/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bas;
import Book.*;
import Employee.*;
import Databases.*;
import java.sql.*;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author ridri
 */
public class BAS {
    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
    String userid = "SYSTEM";
    String password = "system"; 
    Connection conn;
    Statement stmt;
    ResultSet rset;
    String query;
    String sqlString;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        BAS datahandler = new BAS();
        ResultSet rset = datahandler.getAllEmployees();

        while (rset.next()) {
            System.out.println(rset.getInt(1) + " " +
            rset.getString(2) + " " + 
            rset.getString(3) + " " + 
            rset.getString(4));
        }
        
        InventoryDatabase id = new InventoryDatabase();
        id.generateId(new BookInStock("title", "author", "publish", 12, 12));
    }
    public ResultSet getAllEmployees() throws SQLException{
        getDBConnection(); 
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
               ResultSet.CONCUR_READ_ONLY);
        query = "SELECT * FROM Employee";
        System.out.println("\nExecuting query: " + query);
        rset = stmt.executeQuery(query); 
        return rset;
    }
    public void getDBConnection() throws SQLException{
        OracleDataSource ds;
        ds = new OracleDataSource();
        ds.setURL(jdbcUrl);
        conn=ds.getConnection(userid,password);
        
    }
}
