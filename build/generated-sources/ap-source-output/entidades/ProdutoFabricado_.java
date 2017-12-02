package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProdutoFabricado.class)
public abstract class ProdutoFabricado_ {

	public static volatile SingularAttribute<ProdutoFabricado, TipoProduto> tipo;
	public static volatile SingularAttribute<ProdutoFabricado, String> codigo;
	public static volatile SingularAttribute<ProdutoFabricado, Double> preco_venda;
	public static volatile SingularAttribute<ProdutoFabricado, String> nome;
	public static volatile SingularAttribute<ProdutoFabricado, Integer> id;

}

