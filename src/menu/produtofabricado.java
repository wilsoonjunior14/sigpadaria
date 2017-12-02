/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;
import entidades.*;
import conexao.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import util.SalvaHistorico;
import login.*;

/**
 *
 * @author Wilson
 */
public class produtofabricado extends javax.swing.JInternalFrame {
    EntityManager entity = login.entity;
    /**
     * Creates new form produtofabricado
     */
    public produtofabricado() {
        initComponents();
        entity.clear();
        entity.getTransaction().begin();
        List<String> lista  = entity.createQuery("SELECT DISTINCT T.descricao FROM TipoProduto T").getResultList();
        entity.getTransaction().commit();
        entity.clear();
        for(String item : lista){
            tipoproduto.addItem(item.toUpperCase());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        precovenda = new javax.swing.JTextField();
        tipoproduto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setTitle("CADASTRO DE PRODUTOS FABRICADOS");

        jLabel1.setText("Nome");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Preço Venda");

        jLabel3.setText("Tipo de Produto");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Código do Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(20, 20, 20)))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codigo)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(tipoproduto, 0, 180, Short.MAX_VALUE)
                    .addComponent(nome)
                    .addComponent(precovenda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precovenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
    String nomeproduto = nome.getText();
    String tipodoproduto = (String) tipoproduto.getSelectedItem();
    String codigoproduto = codigo.getText();
    double valorvenda = Double.parseDouble(precovenda.getText());
    if(!nomeproduto.equals("") && valorvenda>0 && !codigoproduto.equals("")){
        entity.clear();
        entity.getTransaction().begin();
        // RECUPERANDO OS TIPOS DE PRODUTOS JA CADASTRADOS
        TipoProduto tp = (TipoProduto) entity.createQuery("SELECT T FROM TipoProduto T WHERE T.descricao='"+tipodoproduto+"'").getResultList().get(0);

        ProdutoFabricado pf = new ProdutoFabricado();
        pf.setTipo(tp);
        pf.setNome(nomeproduto);
        pf.setPreco_venda(valorvenda);
        pf.setCodigo(codigoproduto);

        // CADASTRANDO UM NOVO PRODUTO FABRICADO
        entity.persist(pf);
        
        // CRIANDO O ESTOQUE 0 
        Estoque e = new Estoque();
        e.setDescricao(pf.getTipo().toString());
        e.setQuantidade(0);
        e.setProdutofabricado(pf);
        entity.persist(e);

        entity.getTransaction().commit();
        entity.clear();
        new SalvaHistorico().salvar("O PRODUTO "+pf.getNome()+" DO TIPO "+pf.getTipo().getDescricao()+" COMEÇOU A SER FABRICADO PELA EMPRESA, CUJO PREÇO DE VENDA SERÁ DE R$"+pf.getPreco_venda());
        new SalvaHistorico().salvar("ESTOQUE INICIALMENTE ZERO DO PRODUTO FABRICADO "+pf.getNome()+" - "+pf.getCodigo()+"");
        
        JOptionPane.showMessageDialog(null,"CADASTRO REALIZADO COM SUCESSO!");
        nome.setText("");
        precovenda.setText("");
    }else{
        JOptionPane.showMessageDialog(null,"ERRO");
    }
}catch(Exception e){
    JOptionPane.showMessageDialog(null,"INFORMAÇÕES INVÁLIDAS");
}

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField precovenda;
    private javax.swing.JComboBox<String> tipoproduto;
    // End of variables declaration//GEN-END:variables
}
