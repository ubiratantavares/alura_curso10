package modulo5.aula.util;

import java.util.Scanner;

public class Operacao {
    public void imprimir(String mensagem) {
        System.out.println(mensagem);
    }

    public String lerDescricao() {
        return new Scanner(System.in).nextLine();
    }

    public double lerValor() {
        return new Scanner(System.in).nextDouble();
    }

    public int lerOpcao() {
        return new Scanner(System.in).nextInt();
    }

}
