/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorios;

import entidades.Estoque;
import entidades.Funcionario;
import entidades.ProdutoFabricado;
import entidades.TipoFuncionario;
import entidades.TipoProduto;
import entidades.Vendas;
import entidades.VendasProdutoFabricado;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Wilson
 */
public class GerarRelatorio {
    
    
    public void geraRelatorioSemParametros(String report,List data_sources) throws JRException{
        JasperReport jr = JasperCompileManager.compileReport(report);
        
        JRBeanCollectionDataSource sources = new JRBeanCollectionDataSource(data_sources,false);
        JasperPrint fill = JasperFillManager.fillReport(jr,null,sources);
        JasperViewer viewer = new JasperViewer(fill,false);
        viewer.show();
    }
    
    //public static void main(String[] args){
    //    EntityManager entity = conexao.Conexao.getConexao();
    //    entity.getTransaction().begin();
        
        // ADICIONANDO UM TIPO DE PRODUTO
        //TipoProduto tp = new TipoProduto();
        //tp.setDescricao("CAFÉ");
        //entity.persist(tp);
        //ADICIONANDO UM PRODUTO FABRICADO
        //ProdutoFabricado pf = new ProdutoFabricado();
        //pf.setNome("CAFÉ EM PÓ");
        //pf.setPreco_venda(3.5);
        //pf.setTipo(tp);
        //entity.persist(pf);
        // ADICIONANDO UM PRODUTO FABRICADO NO ESTOQUE
        //List<ProdutoFabricado> lista  = entity.createQuery("SELECT F FROM ProdutoFabricado F").getResultList();
        //System.out.println(pf.getNome());
        //Estoque e = new Estoque();
        //e.setProdutofabricado(pf);
        //e.setQuantidade(100);
        //entity.persist(e);
       
        // ADICIONANDO PRODUTOS A UMA VENDA
        //List<ProdutoFabricado> lista  = entity.createQuery("SELECT F FROM ProdutoFabricado F").getResultList();
        //Vendas v = new Vendas();
        //v.setValor(150);
        //entity.persist(v);
        
        //VendasProdutoFabricado vpf = new VendasProdutoFabricado();
        //int qtde = 5;
        //for(ProdutoFabricado pf : lista){
        //    vpf.setVendas(v);
        //    vpf.setQuantidade(qtde);
        //    vpf.setProdutofabricado(pf);
        //    qtde+=5;
        //    entity.persist(vpf);
        //   vpf = new VendasProdutoFabricado();
        //}
        
        
       // entity.getTransaction().commit();
       // entity.close();
   // }
    
    public static void main(String[] args) throws IOException{
        File f = new File("C:\\tigre.jpg");
        
        if(f.exists()){
        
        BufferedImage imagem = ImageIO.read(f);
        BufferedImage resized = new BufferedImage(1720,728,BufferedImage.TYPE_INT_RGB);
        
        Graphics2D g = resized.createGraphics();
        g.drawImage(imagem,0,0,1720,728,null);
        g.dispose();
        
        ImageIO.write(resized,"JPG",new File("C:\\projetos\\tigre-resized.jpg"));
        }else{
            System.out.println("erro");
        }
        
        EntityManager entity = conexao.Conexao.getConexao();
        
        entity.getTransaction().begin();
        
        System.out.println(entity.createQuery("SELECT P FROM VWProdutosFabricados P").getResultList().size());
        
    }
    
}
