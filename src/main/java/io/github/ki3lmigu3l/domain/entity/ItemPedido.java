package io.github.ki3lmigu3l.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "item_pedido")
public class ItemPedido {

    private Integer id;
    private Pedido pedido;
    private Cliente cliente;
}
