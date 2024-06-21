package model;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int agencia, int numeroConta, double saldo, Cliente cliente) {
        super(agencia, numeroConta, saldo, cliente);
    }

    public void imprimirExtrato() {
        System.out.println("=== CONTA POUPANÇA ===");
        super.imprimirDadosComuns();
    }
}
