package Pedidos;

public class ItemPedido {
    private String descricao;
    private double preco;
    private int quantidade;

    public ItemPedido(String descricao, double preco, int quantidade){
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getDescricao(){
        return descricao;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }
}