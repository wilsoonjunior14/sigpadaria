package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(VendasProdutoSecundario.class)
public abstract class VendasProdutoSecundario_ {

	public static volatile SingularAttribute<VendasProdutoSecundario, Vendas> vendas;
	public static volatile SingularAttribute<VendasProdutoSecundario, Integer> id;
	public static volatile SingularAttribute<VendasProdutoSecundario, Integer> quantidade;
	public static volatile SingularAttribute<VendasProdutoSecundario, ProdutoSecundario> produtosecundario;

}

