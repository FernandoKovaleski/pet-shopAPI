package br.com.tt.petshop.repository;
import br.com.tt.petshop.Repository.ClienteRepository;
import br.com.tt.petshop.model.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.time.LocalDate;
import java.util.List;

@DataJpaTest
public class ClienteRepositoryTest {

    @Autowired //No lugar do construtor, somente em TESTES!
    private ClienteRepository clienteRepository;

    @Autowired
    private TestEntityManager em;

    @Test
    void deveRetornarListaVazia(){
        List<Cliente> clientes = clienteRepository.findAll();
        Assertions.assertEquals(0, clientes.size());
    }

    @Test
    void deveRetornarClienteFulano(){
        em.persist(new Cliente(null, "Fulano", LocalDate.now(), "51 99999999", "751.904.090-90"));

        List<Cliente> clientes = clienteRepository.findAll();
        Assertions.assertEquals(1, clientes.size());
        Assertions.assertEquals("Fulano", clientes.get(0).getNome());
    }

    @Test
    void deveRetornarFulanoPorCpf(){
        em.persist(new Cliente(null, "Theo", LocalDate.parse("2020-01-03"), "51 99999999", "751.904.090-90"));
        em.persist(new Cliente(null, "Enzo", LocalDate.parse("2019-03-04"), "51 888-888", "631.975.590-37"));

        Cliente cliente = clienteRepository.findByCpf("631.975.590-37");
        Assertions.assertEquals("Enzo", cliente.getNome());
        Assertions.assertEquals("51 888-888", cliente.getTelefone());
        Assertions.assertEquals("631.975.590-37", cliente.getCpf());
        Assertions.assertEquals(LocalDate.parse("2019-03-04"), cliente.getNascimento());
    }

}