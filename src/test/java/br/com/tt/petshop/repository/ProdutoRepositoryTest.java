package br.com.tt.petshop.repository;


import br.com.tt.petshop.Repository.ProdutoRepository;
import br.com.tt.petshop.model.Produto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.math.BigDecimal;
import java.util.List;

@DataJpaTest
public class ProdutoRepositoryTest {
    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired //No lugar do construtor, somente em TESTES!
    private TestEntityManager em;

    @Test
    void deveRetornarTodos() {
        em.persist(new Produto(null, "shampoo", BigDecimal.valueOf(45.20), true));
        em.persist(new Produto(null, "ração", BigDecimal.valueOf(45.20), true));


        List<Produto> produtos = produtoRepository.findAll();


    }
}
