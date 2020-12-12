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
public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private String telefone;
    private char sexo;

    public Cliente(String nome, String cpf, Endereco endereco, String telefone, char sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.sexo = sexo;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public char getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereço(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public void inserirCliente () {
        DBConnection bd = new DBConnection();

        bd.openConnection();

        bd.executeUpdateSQL("insert into db_arboutique.tb_cliente (nome, cpf, telefone, sexo) values ('"+ nome + "', '"+ cpf + "', '" + telefone + "', '" + sexo + "')");
        bd.executeUpdateSQL("insert into db_arboutique.tb_endereco (cpf, rua, numero, bairro, cidade, estado, pais, cep) values ('"+ cpf + "', '"+ endereco.getRua() + "', " + endereco.getNumero() + ", '" + endereco.getBairro() + "', '" + endereco.getCidade() + "', '" + endereco.getEstado() + "', '" + endereco.getPais() + "', '" + endereco.getCep() + "')");  
       
        bd.closeConnection();
    }
}
