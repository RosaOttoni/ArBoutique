/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboutique;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author ROSAELUIZ
 */
@Entity
@Table(name = "tb_produto", catalog = "db_arboutique", schema = "")
@NamedQueries({
    @NamedQuery(name = "TbProduto.findAll", query = "SELECT t FROM TbProduto t")
    , @NamedQuery(name = "TbProduto.findByIdtbProduto", query = "SELECT t FROM TbProduto t WHERE t.idtbProduto = :idtbProduto")
    , @NamedQuery(name = "TbProduto.findByNome", query = "SELECT t FROM TbProduto t WHERE t.nome = :nome")
    , @NamedQuery(name = "TbProduto.findByTipo", query = "SELECT t FROM TbProduto t WHERE t.tipo = :tipo")
    , @NamedQuery(name = "TbProduto.findByPreco", query = "SELECT t FROM TbProduto t WHERE t.preco = :preco")
    , @NamedQuery(name = "TbProduto.findByQuantidade", query = "SELECT t FROM TbProduto t WHERE t.quantidade = :quantidade")
    , @NamedQuery(name = "TbProduto.findByDescricao", query = "SELECT t FROM TbProduto t WHERE t.descricao = :descricao")})
public class TbProduto implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idtb_produto")
    private Integer idtbProduto;
    @Column(name = "nome")
    private String nome;
    @Column(name = "tipo")
    private String tipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private Double preco;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "descricao")
    private String descricao;

    public TbProduto() {
    }

    public TbProduto(Integer idtbProduto) {
        this.idtbProduto = idtbProduto;
    }

    public Integer getIdtbProduto() {
        return idtbProduto;
    }

    public void setIdtbProduto(Integer idtbProduto) {
        Integer oldIdtbProduto = this.idtbProduto;
        this.idtbProduto = idtbProduto;
        changeSupport.firePropertyChange("idtbProduto", oldIdtbProduto, idtbProduto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        String oldTipo = this.tipo;
        this.tipo = tipo;
        changeSupport.firePropertyChange("tipo", oldTipo, tipo);
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        Double oldPreco = this.preco;
        this.preco = preco;
        changeSupport.firePropertyChange("preco", oldPreco, preco);
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        Integer oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        changeSupport.firePropertyChange("quantidade", oldQuantidade, quantidade);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtbProduto != null ? idtbProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbProduto)) {
            return false;
        }
        TbProduto other = (TbProduto) object;
        if ((this.idtbProduto == null && other.idtbProduto != null) || (this.idtbProduto != null && !this.idtbProduto.equals(other.idtbProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arboutique.TbProduto[ idtbProduto=" + idtbProduto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
