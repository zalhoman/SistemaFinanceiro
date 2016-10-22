package br.com.hibernate.test.modelo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Created by andrepereira on 18/10/16.
 */
@Entity
public class Movimentacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_movimentacao;

    private BigDecimal montante;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private TipoMovimentacao tipoMovimentacao;

    @Temporal(TemporalType.DATE) //date só data; time só hora; timestamp os dois
    private Calendar data;

    @ManyToOne
    private Conta conta;

    public Integer getId_movimentacao() {
        return id_movimentacao;
    }

    public void setId_movimentacao(Integer id_movimentacao) {
        this.id_movimentacao = id_movimentacao;
    }

    public BigDecimal getMontante() {
        return montante;
    }

    public void setMontante(BigDecimal montante) {
        this.montante = montante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoMovimentacao getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
