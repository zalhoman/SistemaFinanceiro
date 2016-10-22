package br.com.hibernate.test.teste;

import br.com.hibernate.test.modelo.Conta;
import br.com.hibernate.test.modelo.Movimentacao;
import br.com.hibernate.test.modelo.TipoMovimentacao;
import br.com.hibernate.test.utils.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Created by andrepereira on 19/10/16.
 */
public class TesteJPARelacionamento {

    public static void main(String[] args){

        EntityManager manager = new JPAUtil().getEntityManager();

        Conta conta = manager.find(Conta.class, 4);

        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setData(Calendar.getInstance());
        movimentacao.setDescricao("Internet");
        movimentacao.setTipoMovimentacao(TipoMovimentacao.SAIDA);
        movimentacao.setMontante(new BigDecimal("143.6"));

        movimentacao.setConta(conta);

        manager.getTransaction().begin();

        manager.persist(movimentacao);

        manager.getTransaction().commit();

        manager.close();

    }
}
