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
public class TesteMovimentacaoConta {

    public static void main(String[] args) {

        EntityManager manager = new JPAUtil().getEntityManager();

        Query query = manager.createQuery("select c from Conta as c join fetch c.movimentacoes");

        List<Conta> contas = query.getResultList();

        for (Conta conta :
                contas) {
            System.out.println("Numero de movimentacoes " + conta.getMovimentacoes().size());
        }
    }
}
