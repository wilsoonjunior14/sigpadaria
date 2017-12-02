package entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Mercadoria.class)
public abstract class Mercadoria_ {

	public static volatile SingularAttribute<Mercadoria, String> codigo;
	public static volatile SingularAttribute<Mercadoria, Double> custo;
	public static volatile SingularAttribute<Mercadoria, String> nome;
	public static volatile SingularAttribute<Mercadoria, Integer> id;
	public static volatile SingularAttribute<Mercadoria, String> quantidade;
	public static volatile SingularAttribute<Mercadoria, Date> data_compra;
	public static volatile SingularAttribute<Mercadoria, String> descricao;

}

