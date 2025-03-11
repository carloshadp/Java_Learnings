package Exercicio_2;

import java.util.*;

public class Restaurante {
    private List<Prato> cardapio = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public List<Prato> getCardapio(){ return cardapio; }
    public List<Pedido> getPedidos(){ return pedidos; }

    public void adicionarPrato(Prato prato){
        cardapio.add(prato);
        System.out.println("Prato adicionado");
    }
    public void removerPrato(Prato prato){
        try{
          cardapio.remove(prato);
            System.out.println("Prato removido");
        }catch (Exception e){
            System.out.println("Erro: "+e);
        }
    }

    public void fazerPedido(){
        System.out.println("Qual prato deseja? temos essas opções: "+ cardapio);
        System.out.print("Escolha: ");
        String prato = scanner.next();
    }

    public void adicionarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public void verPedido(Pedido pedido){
        System.out.println("Pedido n°: +"+pedido.getNumeroPedido()+
                            "Pratos: "+pedido.getPratos()+
                            "Cliente: "+pedido.getCliente()+
                            "Total: "+pedido.getTotal());
    }

    public void cancelarPedido(Pedido pedido){
        try{
            pedidos.remove(pedido);
            System.out.println("Pedido Cancelado");
        }catch(Exception e){
            System.out.println("Erro: "+e);
        }
    }

}
