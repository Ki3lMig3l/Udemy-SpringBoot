package io.github.ki3lmigu3l.domain.repositorios;

import io.github.ki3lmigu3l.domain.entity.Cliente;
import io.github.ki3lmigu3l.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {


    // Encontrando o cliente do pedido através dos Method Query...
    List<Pedido> findByCliente(Cliente cliente);
}
