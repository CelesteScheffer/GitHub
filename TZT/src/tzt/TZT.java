/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tzt;
import java.sql.*;

/**
 *
 * @author Celeste
 */
public class TZT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Class.forName("com.mysql.jdbc.Driver");
        }
        catch (Exception e){
            System.out.println("error");
        }
        GUI gui = new GUI();
    }
}
