/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tzt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Celeste
 */
public class Database {

    private static Database db;

    public static Database getDatabase() {
        if (db == null) {
            db = new Database();
        }
        return db;
    }

    private Database() {
    }

    private Connection connectDatabase() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/TZT";
        String username = "root", password = "usbw";
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    public ArrayList<Entiteit> select(String tabel, ArrayList<WhereStatement> ws) throws SQLException {

        ArrayList<Entiteit> e = new ArrayList<>();
        Connection connection = connectDatabase();
        Statement statement = connection.createStatement();
        String q = "SELECT * FROM " + tabel;

        if (ws != null) {
            String glue = " WHERE ";
            for (WhereStatement w : ws) {
                q += glue + w;
                glue = " AND ";
            }
        }
        //System.out.println(q);
        ResultSet rs = statement.executeQuery(q);

        boolean next = rs.next();
        while (next == true) {

            switch (tabel) {
                case "Gebruiker":
                    e.add(new Gebruiker(rs));
                    break;
            };
        }


        statement.close();
        connection.close();
        return e;
    }

    public ArrayList<Entiteit> select(String tabel) throws SQLException {
        return select(tabel, null);
    }

    public Entiteit selectOne(String tabel, ArrayList<WhereStatement> ws) throws SQLException {
        ArrayList<Entiteit> e = select(tabel, ws);
       try{
           return e.get(0);
       }
       catch (ArrayIndexOutOfBoundsException ex){
           return null;
       }
    }
}
