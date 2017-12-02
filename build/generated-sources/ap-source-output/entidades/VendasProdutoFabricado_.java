package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(VendasProdutoFabricado.class)
public abstract class VendasProdutoFabricado_ {

	public static volatile SingularAttribute<VendasProdutoFabricado, Vendas> vendas;
	public static volatile SingularAttribute<VendasProdutoFabricado, Integer> id;
	public static volatile SingularAttribute<VendasProdutoFabricado, Integer> quantidade;
	public static volatile SingularAttribute<VendasProdutoFabricado, ProdutoFabricado> produtofabricado;

}

