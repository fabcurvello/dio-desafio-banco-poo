package controller;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Cadastros {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Ana", "01/01/2000");
        Cliente c2 = new Cliente("Carlos", "01/02/2003");
        Cliente c3 = new Cliente("Julia", "01/03/2004");
        Cliente c4 = new Cliente("Pedro", "01/04/2005");

        ContaCorrente cc1 = new ContaCorrente(1001, 20000, 500,c1, 2000);
        ContaPoupanca cp1 = new ContaPoupanca(1000, 50000,1000, c2);

        cp1.depositar(500);
        cp1.depositar(300);
        cp1.transferir(100, cc1);

        cc1.sacar(500);

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();
    }
}
