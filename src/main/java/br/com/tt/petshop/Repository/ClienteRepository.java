package br.com.tt.petshop.Repository;

import br.com.tt.petshop.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;


//@br.com.tt.petshop.Repository - Não precisa colocar quando estender
//  uma interface do Spring Data!
public interface ClienteRepository
        extends JpaRepository<Cliente, Long> {

    //select distinct * from tb_cliente where cpf = %cpf% OR telefone = %2%
    // order by id
    List<Cliente> findDistinctByCpfOrTelefoneOrderById(String cpf, String telefone);

    Cliente findByCpf(String cpf);
    Cliente findByCpfAndTelefoneIsNotNull(String cpf);

    //Select * from tb_cliente where nome like '%n%'
    Cliente findByNomeContaining(String nome);

    //Select * from tb_cliente where nome like 'n%'
    Cliente findByNomeStartingWith(String nome);

    //Select * from tb_cliente where nome like '%n'
    Cliente findByNomeEndingWith(String nome);

    List<Cliente> findByNascimentoBetween(LocalDate ini, LocalDate fim);

    Cliente buscarPorC
}