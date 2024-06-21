package model;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int agencia, int numeroConta, double saldo, Cliente cliente, double limite) {
        super(agencia, numeroConta, saldo, cliente);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void imprimirExtrato() {
        System.out.println("=== CONTA CORRENTE ===");
        super.imprimirDadosComuns();
        System.out.printf("Limite: R$ %.2f \n", this.limite);
    }
}
