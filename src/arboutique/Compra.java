/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboutique;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ROSAELUIZ
 */
public class Compra {
    private float total;
    private String clienteCpf;
    private int formaPagamento;
    private int idProduto;
    private String funcionarioCpf;

    public Compra(float total, String clienteCpf, int formaPagamento, int idProduto, String funcionarioCpf) {
        this.total = total;
        this.clienteCpf = clienteCpf;
        this.formaPagamento = formaPagamento;
        this.idProduto = idProduto;
        this.funcionarioCpf = funcionarioCpf;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(String clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getFuncionarioCpf() {
        return funcionarioCpf;
    }

    public void setFuncionarioCpf(String funcionarioCpf) {
        this.funcionarioCpf = funcionarioCpf;
    }

    /*
    public void calculaPrecoTotal (){
        
        DBConnection bd = new DBConnection();
        bd.openConnection();
        
        total = 0;
        int qtd, produto;
        double precoUnit;
        
        try {
            
            ResultSet r = bd.executeQuerySQL("SELECT quantidade, produto FROM tb_item where idtb_venda = " + idVenda);

            while (r.next()) {
                
                qtd = r.getInt("quantidade");
                System.out.println("qtd: " + qtd);
                produto = r.getInt("produto");
                System.out.println("produto: " + produto);
                
                ResultSet r2 = bd.executeQuerySQL("SELECT preco FROM tb_produto where idtb_produto = " + produto);
                r2.next();
                precoUnit = r2.getDouble("preco");
                System.out.println("precoUnit: " + precoUnit);
                total += qtd * precoUnit;
                System.out.println("precoTot: "+ total);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        bd.executeUpdateSQL("update tb_venda set precoTotal = " + total + " where idtb_venda = " + idVenda);
        
        bd.closeConnection();
        
    }

    public void inserirVenda() {
        DBConnection bd = new DBConnection();

        bd.openConnection();

        bd.executeUpdateSQL("insert into tb_venda (idtb_venda, cliente, formaPagamento) values (" + idVenda + ",'"+ cliente + "', '" + formaPagamento + "')");
       
        bd.closeConnection();
    }
*/
}
