package br.com.hibernate.test.teste;

import br.com.hibernate.test.modelo.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by andrepereira on 18/10/16.
 */
public class TesteJPA {

    public static void main(String[] args){

        Conta conta = new Conta();
        conta.setTitular("Zalhoman");
        conta.setBanco("Banco do Brasil");
        conta.setAgencia("1234-0");
        conta.setNumero("12345-7");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("financas");
        EntityManager manager = entityManagerFactory.createEntityManager();

        manager.getTransaction().begin();

        manager.persist(conta);

        manager.getTransaction().commit();

        manager.close();

    }
}
