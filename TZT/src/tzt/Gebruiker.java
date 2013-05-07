/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tzt;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Celeste
 */
public class Gebruiker extends Entiteit{
    private String gebruikersnaam;
    private String wachtwoord;
    
    public Gebruiker(String gebruikersnaam, String wachtwoord){
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord =  wachtwoord;
    }
    public Gebruiker(ResultSet rs) throws SQLException{
        this(rs.getString("Gebruikersnaam"), rs.getString("Wachtwoord"));
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }
    
    
    
}
