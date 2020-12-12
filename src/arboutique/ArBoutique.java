/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboutique;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ROSAELUIZ
 */
public class ArBoutique {
    
    public static void produto(){
        
        //Marca
        String nomeMarca;
        //Tipo
        String nomeTipo;
        /*Produto*/
        String nomeProduto,sPreco,sQuantidade,descricao, sTipo, sMarca; 
        int quantidade, idTipo, idMarca;
        float preco;
        
        // Menu
        int op;
        String sOp;
        
        sOp = JOptionPane.showInputDialog("Escolha uma opção: "
                                        + "\n 1 - Cadastrar Marca"
                                        + "\n 2 - Cadastrar Categoria"
                                        + "\n 3 - Cadastrar Produto"
                                        + "\n 4 - Editar Produto"
                                        + "\n 5 - Excluir Produto"
                                        + "\n 6 - Exibir Produtos"
                                        + "\n 7 - Sair");
        op = Integer.parseInt(sOp);
        
        switch (op) {
            case 1:
                nomeMarca = JOptionPane.showInputDialog("Digite a marca: ");

                Marca marca = new Marca (nomeMarca);

                marca.inserir();
                
                break;
            case 2:
                nomeTipo = JOptionPane.showInputDialog("Digite a categoria: ");

                Tipo tipo = new Tipo (nomeTipo);

                tipo.inserir();
                
                break;
            case 3:
                    
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Menu*/
        String sOp;
        int op;
        
        /* Endereço*/
        String rua, sNumero, bairro, sCidade, sEstado, pais, cep;
        int numero, cidade, estado;
        
        /*Cliente*/
        String nomeCliente, cpf, telefone, sSexo;
        char sexo;
        
        /*Funcionário*/
        String nomeFuncionario,cpfFuncionario,sSexoFuncionario,sSalario;
        char sexoFuncionario;
        float salario;
        
        /*Compra*/
        String clienteCompra, funcionarioCompra, sFormaPagamento, sIdProduto;
        int formaPagamento, idProduto;
        float totalCompra;
        
        do{
            
            sOp = JOptionPane.showInputDialog("Escolha uma opção: "
                                                   + "\n 1 - Produtos"
                                                   + "\n 2 - Funcionários"
                                                   + "\n 3 - Clientes"
                                                   + "\n 4 - Exibir Dados da Compra"
                                                   + "\n 5 - Exibir Controle de Caixa"
                                                   + "\n 6 - Sair");
            op = Integer.parseInt(sOp);
            
            switch(op){
                case 1: 
                    produto();
                    break;
                case 2:
                    
                    break;
                
                case 3:
                    break;
                    
                case 6:
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
        }while(op != 6);
    }
}
