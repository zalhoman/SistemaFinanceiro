package br.com.hibernate.test.modelo;

import javax.persistence.*;
import java.util.List;

/**
 * Created by andrepereira on 18/10/16.
 */
@Entity
public class Conta {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_conta;

    private String titular;
    private String numero;
    private String banco;
    private String agencia;

    @OneToMany(mappedBy = "conta")
    private List<Movimentacao> movimentacoes;

    public Integer getId_conta() {
        return id_conta;
    }

    public void setId_conta(Integer id_conta) {
        this.id_conta = id_conta;
    }

    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<Movimentacao> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() { return agencia; }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
}
