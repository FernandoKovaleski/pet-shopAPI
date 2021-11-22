package model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nascimento")
    private LocalDate nascimento;

    @Column(name = "telefone")
    private String telefone;

    //O JPA/Hibernate usa esse contrutor!!!
    Cliente(){
    }

    public Cliente(Long id, String nome, LocalDate nascimento, String telefone) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public String getTelefone() {
        return telefone;
    }
}