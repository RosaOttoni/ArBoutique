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
@Table(name = "tb_venda", catalog = "db_arboutique", schema = "")
@NamedQueries({
    @NamedQuery(name = "TbVenda.findAll", query = "SELECT t FROM TbVenda t")
    , @NamedQuery(name = "TbVenda.findByIdtbVenda", query = "SELECT t FROM TbVenda t WHERE t.idtbVenda = :idtbVenda")
    , @NamedQuery(name = "TbVenda.findByPrecoTotal", query = "SELECT t FROM TbVenda t WHERE t.precoTotal = :precoTotal")
    , @NamedQuery(name = "TbVenda.findByCliente", query = "SELECT t FROM TbVenda t WHERE t.cliente = :cliente")
    , @NamedQuery(name = "TbVenda.findByFormaPagamento", query = "SELECT t FROM TbVenda t WHERE t.formaPagamento = :formaPagamento")})
public class TbVenda implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idtb_venda")
    private Integer idtbVenda;
    @Column(name = "precoTotal")
    private String precoTotal;
    @Column(name = "cliente")
    private String cliente;
    @Column(name = "formaPagamento")
    private String formaPagamento;

    public TbVenda() {
    }

    public TbVenda(Integer idtbVenda) {
        this.idtbVenda = idtbVenda;
    }

    public Integer getIdtbVenda() {
        return idtbVenda;
    }

    public void setIdtbVenda(Integer idtbVenda) {
        Integer oldIdtbVenda = this.idtbVenda;
        this.idtbVenda = idtbVenda;
        changeSupport.firePropertyChange("idtbVenda", oldIdtbVenda, idtbVenda);
    }

    public String getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(String precoTotal) {
        String oldPrecoTotal = this.precoTotal;
        this.precoTotal = precoTotal;
        changeSupport.firePropertyChange("precoTotal", oldPrecoTotal, precoTotal);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        String oldCliente = this.cliente;
        this.cliente = cliente;
        changeSupport.firePropertyChange("cliente", oldCliente, cliente);
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        String oldFormaPagamento = this.formaPagamento;
        this.formaPagamento = formaPagamento;
        changeSupport.firePropertyChange("formaPagamento", oldFormaPagamento, formaPagamento);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtbVenda != null ? idtbVenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbVenda)) {
            return false;
        }
        TbVenda other = (TbVenda) object;
        if ((this.idtbVenda == null && other.idtbVenda != null) || (this.idtbVenda != null && !this.idtbVenda.equals(other.idtbVenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "arboutique.TbVenda[ idtbVenda=" + idtbVenda + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
