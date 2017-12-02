package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProdutoSecundario.class)
public abstract class ProdutoSecundario_ {

	public static volatile SingularAttribute<ProdutoSecundario, String> marca;
	public static volatile SingularAttribute<ProdutoSecundario, String> codigo;
	public static volatile SingularAttribute<ProdutoSecundario, TipoProduto> tipo;
	public static volatile SingularAttribute<ProdutoSecundario, Double> preco_venda;
	public static volatile SingularAttribute<ProdutoSecundario, String> nome;
	public static volatile SingularAttribute<ProdutoSecundario, Integer> id;
	public static volatile SingularAttribute<ProdutoSecundario, Double> preco_compra;

}

