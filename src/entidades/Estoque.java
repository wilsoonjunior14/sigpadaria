/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Wilson
 */
@Entity
public class Estoque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @NotNull
    private int quantidade;
    
    private String descricao;
    
    @OneToOne(cascade = CascadeType.ALL)
    private ProdutoFabricado produtofabricado;
    
    @OneToOne(cascade = CascadeType.ALL)
    private ProdutoSecundario produtosecundario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ProdutoFabricado getProdutofabricado() {
        return produtofabricado;
    }

    public void setProdutofabricado(ProdutoFabricado produtofabricado) {
        this.produtofabricado = produtofabricado;
    }

    public ProdutoSecundario getProdutosecundario() {
        return produtosecundario;
    }

    public void setProdutosecundario(ProdutoSecundario produtosecundario) {
        this.produtosecundario = produtosecundario;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estoque)) {
            return false;
        }
        Estoque other = (Estoque) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Estoque[ id=" + id + " ]";
    }
    
}
