/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem;

import java.sql.*;

/**
 *
 * @author Admin
 */
public class GlobalVariables {

    public static String username = "";
    public static Boolean isAdmin = false;

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    String DB_URL = "jdbc:mysql://localhost:3307/inventorysystem";

    String user = "root";
    String password = "pardorla1234";

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    String userid;

    public GlobalVariables() {
        openDatabase();
    }

    public void openDatabase() {
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            conn = DriverManager.getConnection(DB_URL, user, password);
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            if (!conn.isClosed()) {

                System.out.print("Database Connection Successful!");

            }

        } catch (Exception e) {
            
            System.out.print("Database Connection Error! \nPlease Contact ......");
        }

    }

    public static void main(String[] args) {
        // TODO code application logic hereS

        //DBMS connection = new DBMS();
        //connection.openDatabase();
        new GlobalVariables();

    }

}
