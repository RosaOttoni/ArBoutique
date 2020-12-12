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
public class Item {
    private int produto;
    private int quantidade;
    private int idVenda;

    public Item(int idVenda, int produto, int quantidade) {
        this.idVenda = idVenda;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void inserirItem () {
        DBConnection bd = new DBConnection();

        bd.openConnection();

        bd.executeUpdateSQL("insert into tb_item (produto, quantidade, idtb_venda) values ('"+ produto + "', "+ quantidade + ", " + idVenda + ")");
       
        bd.closeConnection();
    }
}
