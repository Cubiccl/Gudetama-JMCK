package jmck.gudetama.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import jmck.gudetama.model.Arc;

import org.springframework.stereotype.Repository;

@Repository
public class ArcDAO
{

	@PersistenceContext
	private EntityManager manager;
	
	public List<Arc> listArcs() {
		
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Arc> criteria = builder.createQuery(Arc.class);
		TypedQuery<Arc> query = manager.createQuery(criteria);
		
		return query.getResultList();
	}
	
	public void createArc(Arc a) {
		manager.persist(a);
	}

}
