package modulo5.aula.modelos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CartaoDeCredito {

    private double limite;
    private double saldo;

    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean lancarCompra(Compra compra) {
        if (this.getSaldo() >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public void exibirListaDeCompras() {
        this.compras.sort(Comparator.comparing(Compra::getValor));
        System.out.println("*** COMPRAS REALIZADAS ***");
        System.out.println("Descrição\t\tValor (R$)");
        for (Compra compra : this.compras) {
            System.out.println(compra);
        }
        System.out.println("**************************");
        System.out.println(String.format("Valor total das compras realizadas: %.2f", (this.getLimite() - this.getSaldo())));
        System.out.println(String.format("Saldo disponível para compras no cartão de crédito: %.2f", this.getSaldo()));

    }
}
