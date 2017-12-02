/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Wilson
 */
public class Conexao {
    
    public static EntityManager getConexao(){
        return Persistence.createEntityManagerFactory("SIGPadaria").createEntityManager();
    }
    
}
