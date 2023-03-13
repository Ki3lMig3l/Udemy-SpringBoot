package io.github.ki3lmigu3l.domain.repositorios;

import io.github.ki3lmigu3l.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Clientes extends JpaRepository<Cliente, Integer> {


    // Utilizando SQL native...
    @Query(value = "Select * from cliente c where c.nome Like '%:nome%'", nativeQuery = true)
    List<Cliente> encontrarPorNome(@Param("nome") String nome);


    // Utilizando JPQL...
    @Query("delete from Cliente c where c.nome = :nome")
    @Modifying
    void deleteByNome(String nome);

    // Utilizando convensão do Query Method...
    boolean existsByNome(String nome);

    // Utilizando o Fetch para trazer os pedidos do cliente...
    @Query(" select c from Cliente c left join fetch c.pedidos where c.id = :id")
    Cliente findClienteFetchPedidos(@Param("id") Integer id);
}
