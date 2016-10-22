package br.com.hibernate.test.teste;

import br.com.hibernate.test.modelo.Conta;
import br.com.hibernate.test.modelo.Movimentacao;
import br.com.hibernate.test.utils.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by andrepereira on 21/10/16.
 */
public class TesteConsulta {

    public static void main(String[] args){
        EntityManager manager = new JPAUtil().getEntityManager();

        Conta conta = new Conta();
        conta.setId_conta(4);

        Query query = manager.createQuery("select m from Movimentacao as m where m.conta=:pConta"
                + " order by m.montante desc");

        query.setParameter("pConta", conta);

        List<Movimentacao> movimentacoes = query.getResultList();

        for (Movimentacao m : movimentacoes) {

            System.out.println("\nDescricao:  " + m.getDescricao());
            System.out.println("\nValor:..... R$ " + m.getMontante());
        }
    }



}
