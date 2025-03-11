package Exercicio_2;
import java.util.*;

public class Pedido {
    private int numeroPedido;
    private String cliente;
    private List<Prato> pratos;
    private double total;


    public Pedido(int numeroPedido, String cliente, List<Prato> pratos){
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.pratos = pratos;

        double soma = 0;
        for (Prato prato : pratos){
            soma+=prato.getPreco();
        }
        this.total = soma;
    }

    public List<Prato> getPratos() { return pratos; }
    public int getNumeroPedido() { return numeroPedido; }
    public double getTotal() { return total; }
    public String getCliente() { return cliente; }



    @Override
    public String toString(){
        return "\nPedido: "+numeroPedido+
                "\nCliente: "+cliente+
                "\nPratos: "+pratos+
                "\nTotal: R$"+total;
    }

}
