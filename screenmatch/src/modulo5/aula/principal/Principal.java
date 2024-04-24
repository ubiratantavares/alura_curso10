package modulo5.aula.principal;

import modulo5.aula.modelos.CartaoDeCredito;
import modulo5.aula.modelos.Compra;
import modulo5.aula.util.Operacao;

public class Principal {

    public static void main(String[] args) {

        Operacao operacao = new Operacao();

        operacao.imprimir("Aplicação de Compras");

        int opcao = 1;

        operacao.imprimir("Digite o limite do cartão de crédito: ");

        CartaoDeCredito cartao = new CartaoDeCredito(operacao.lerValor());

        while (opcao == 1) {
            operacao.imprimir("Digite a descrição da compra: ");
            String descricao = operacao.lerDescricao();
            operacao.imprimir("Digite o valor da compra: ");
            double valor = operacao.lerValor();

            Compra compra = new Compra(descricao, valor);

            if (cartao.lancarCompra(compra)) {
                operacao.imprimir("Compra realizada com sucesso!");
            } else {
                operacao.imprimir("Saldo do cartão de crédito é insuficiente para esta compra!");
            }
            operacao.imprimir("Digite 0 para sair ou 1 para continuar");
            opcao = operacao.lerOpcao();
        }
        cartao.exibirListaDeCompras();
    }
}
