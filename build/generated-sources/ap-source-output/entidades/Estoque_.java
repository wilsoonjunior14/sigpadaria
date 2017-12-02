package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Estoque.class)
public abstract class Estoque_ {

	public static volatile SingularAttribute<Estoque, Integer> id;
	public static volatile SingularAttribute<Estoque, Integer> quantidade;
	public static volatile SingularAttribute<Estoque, ProdutoFabricado> produtofabricado;
	public static volatile SingularAttribute<Estoque, String> descricao;
	public static volatile SingularAttribute<Estoque, ProdutoSecundario> produtosecundario;

}

