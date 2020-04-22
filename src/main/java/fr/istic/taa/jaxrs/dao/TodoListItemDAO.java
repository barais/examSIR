package fr.istic.taa.jaxrs.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.TemporalType;

import fr.istic.taa.jaxrs.dao.generic.AbstractJpaDao;
import fr.istic.taa.jaxrs.domain.Person;
import fr.istic.taa.jaxrs.domain.TODOListItem;

public class TodoListItemDAO extends AbstractJpaDao<Long, TODOListItem>{

	
	public TodoListItemDAO() {
		super();
		this.setClazz(TODOListItem.class);
	}	 
	
	
	//Q12
	public List<TODOListItem> getAllTaskByDate(Person p, Date d1, Date d2) {
		return this.entityManager.createQuery(
				"select todo from TODOListItem as todo where todo.todolist.user = :p and todo.dueDate BETWEEN :d1 AND :d2 and todo.done = false", TODOListItem.class)
				.setParameter("p",p).setParameter("d1", d1, TemporalType.DATE )
		.setParameter("d2", d2, TemporalType.DATE ).getResultList();
	}
}
