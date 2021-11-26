package br.com.tt.petshop.Repository;

import br.com.tt.petshop.model.Cliente;
import br.com.tt.petshop.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

//@br.com.tt.petshop.Repository - Não precisa colocar quando estender
//  uma interface do Spring Data!
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findAll();

    List<Produto> findByNomeContaining(String nome);

    Produto findBynome(String nome);

    List<Cliente> findByValorBetween(BigDecimal ini, BigDecimal fim);
}

