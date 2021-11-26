package br.com.tt.petshop.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table (name = "tb_produto")
public class Produto {
    @Id
    @Column (name = "id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "valor")
    private BigDecimal valor;

    @Column(name = "ativo")
    private Boolean ativo;

    public Produto() {

    }

    public Produto(Long id, String nome, BigDecimal valor, Boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.ativo = ativo;
    }

    public Produto(Long id, String shampo, int i, String s) {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Boolean isAtivo() {
        return ativo;
    }
}
