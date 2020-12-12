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
public class Marca {
    private String marca;

    public Marca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void inserir() {
        DBConnection bd = new DBConnection();

        bd.openConnection();

        bd.executeUpdateSQL("INSERT INTO rosa.trabalho_marca "
                            + "(marca) values ('"+ marca + "')");
       
        bd.closeConnection();
    }
}
