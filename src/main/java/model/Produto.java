package model;

import javax.persistence.*;
import java.math.BigDecimal;

//id, nome, valor ativo
@Entity
@Table (name = "tb_produtos")
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

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Boolean getAtivo() {
        return ativo;
    }
}
