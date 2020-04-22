package fr.istic.taa.jaxrs.dao;

import fr.istic.taa.jaxrs.dao.generic.AbstractJpaDao;
import fr.istic.taa.jaxrs.domain.Person;

public class PersonDAO extends AbstractJpaDao<Long, Person>{

	
	public PersonDAO() {
		super();
		this.setClazz(Person.class);
	}	
	
	

}
