package Exercicio_2;
import java.io.*;
import java.util.*;


public class SistemaRestaurante {
    public static void main(String[] args){
        Restaurante restaurante = new Restaurante();

        Prato macarrao = new Prato("Macarrão", 20, "Bom demais!");
        Prato arroz_e_feijao = new Prato("Arroz e Feijão", 18, "Não tem erro!");

        Pedido pedido1 = new Pedido(1, "Carlos", List.of(macarrao, arroz_e_feijao));

        restaurante.adicionarPrato(macarrao);
        restaurante.adicionarPrato(arroz_e_feijao);

        restaurante.adicionarPedido(pedido1);

        restaurante.verPedido(pedido1);

        restaurante.cancelarPedido(pedido1);
    }
}
