package Exercicio_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class PedidoTest {
    private Pedido pedido;
    private Prato strogonoff;
    private Prato feijoada;

    @BeforeEach
    void setUp() {
        strogonoff = new Prato("Carne e molho", 37, "Bom demais sô!!");
        feijoada = new Prato("Feijão preto", 28, "Cuidado Caganeira!");
        pedido = new Pedido(1, "Carlos", List.of(strogonoff, feijoada));
    }

    @Test
    void getPratos() {
        assertEquals(2, pedido.getPratos().size(), "O pedido deve ter 2 pratos");
        assertTrue(pedido.getPratos().contains(strogonoff), "O pedido deve conter o prato strogonoff");
        assertTrue(pedido.getPratos().contains(feijoada), "O pedido deve conter o prato feijoada");
    }

    @Test
    void getNumeroPedido() {
        assertEquals(1, pedido.getNumeroPedido(), "O número do pedido deve ser 1");
    }

    @Test
    void getTotal() {
        assertEquals(65, pedido.getTotal(), "O pedito tem que dar total R$65");
    }

    @Test
    void getCliente() {
        assertEquals("Carlos", pedido.getCliente(), "O cliente deve ser Carlos");
    }

}