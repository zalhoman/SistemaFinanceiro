package br.com.hibernate.test.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by andrepereira on 21/10/16.
 */
public class JPAUtil {

    private static EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("financas");

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}