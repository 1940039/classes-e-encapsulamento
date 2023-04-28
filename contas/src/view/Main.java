package view;

import model.Cliente;
import model.Produto;
import model.Conta;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook core i7", 1500.89);
        Produto produto2 = new Produto("TV LED 42", 2545.99);

        Cliente cliente1 = new Cliente("Amanda", "123.456.789-10");
        Cliente cliente2 = new Cliente("Liz", "109.876.543-21");

        Conta conta1 = new Conta(1, "05/07/2011", "01/07/2011", produto1, cliente1);
        Conta conta2 = new Conta(2, "01/07/2011", "30/06/2011", produto2, cliente2);

        conta1.visualizarConta();
        System.out.println();
        conta2.visualizarConta();
    }
} 