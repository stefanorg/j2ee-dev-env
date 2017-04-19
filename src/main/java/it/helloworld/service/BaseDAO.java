package it.helloworld.service;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by stefano on 07/04/17.
 */
public class BaseDAO<T> implements IBaseDAO<T> {

    @Inject
    protected EntityManager entityManager;

    protected Class<T> entityType;


    BaseDAO() { }

    @SuppressWarnings("unchecked")
    public BaseDAO(Class<T> entityType) {
        this.entityType = entityType;
//        this.entityType = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public List<T> findAll() {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(this.entityType);
        Root<T> rootEntry = cq.from(this.entityType);
        CriteriaQuery<T> all = cq.select(rootEntry);
        TypedQuery<T> allQuery = this.entityManager.createQuery(all);
        return allQuery.getResultList();

    }

    @SuppressWarnings("unchecked")
    public T get(int id) {
//        return this.entityManager.find(this.entityType, id);
        return null;
    }
}
