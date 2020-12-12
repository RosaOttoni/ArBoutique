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
public class Produto {
    private String nome;
    private int tipo;
    private int marca;
    private float preco;
    private int quantidade;
    private String descricao;

    public Produto(String nome, int tipo, int marca, float preco, int quantidade, String descricao) {
        this.nome = nome;
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void inserir() {
        DBConnection bd = new DBConnection();

        bd.openConnection();
        
        bd.executeUpdateSQL("INSERT INTO rosa.trabalho_produto " 
                            + "(Tipo_idTipo, Marca_idMarca, nome, descricao,preco,quantidade)" 
                            + "values ("+ tipo +", "+ marca +" , '" + nome + "', '" + descricao + "', " + preco + ", " + quantidade + ")");
       
        bd.closeConnection();
    }
    
}
