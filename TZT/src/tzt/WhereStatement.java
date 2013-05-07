/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tzt;

/**
 *
 * @author Celeste
 */
public class WhereStatement {
    private String kolom;
    private String operator;
    private String value;
    
    public WhereStatement(String kolom, String operator, String value){
        this.kolom = kolom;
        this.operator = operator;
        this.value = value;
    }
    
    public WhereStatement(String kolom, String value){
        this(kolom,"=",value);
    }
    
    @Override
    public String toString(){
        return kolom + " " + operator + " '" + value + "'";
        
    }
    
}
