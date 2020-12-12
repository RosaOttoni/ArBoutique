/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboutique;

/**
 *
 * @author ROSAELUIZ
 */
public class Tipo {
    private String tipo;

    public Tipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void inserir() {
        DBConnection bd = new DBConnection();

        bd.openConnection();

        bd.executeUpdateSQL("INSERT INTO rosa.trabalho_tipo "
                            + "(tipo) values ('"+ tipo + "')");
       
        bd.closeConnection();
    }
    
}
