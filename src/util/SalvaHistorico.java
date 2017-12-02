/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entidades.Historico;
import java.util.Calendar;
import javax.persistence.EntityManager;

/**
 *
 * @author Wilson
 */
public class SalvaHistorico {
    EntityManager entity;
    
    public void salvar(String descricao){
        entity = conexao.Conexao.getConexao();
        entity.clear();
        
        entity.getTransaction().begin();
        Historico h = new Historico();
        h.setData(Calendar.getInstance().getTime());
        h.setDescricao(descricao+" Em "+h.getData().toLocaleString());
        entity.persist(h);
        entity.getTransaction().commit();
        
    }
    
}
