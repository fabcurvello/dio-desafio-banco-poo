package model;

public abstract class Conta implements IConta {

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(int agencia, int numeroConta, double saldo, Cliente cliente) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirDadosComuns() {
        System.out.printf("Cliente: %s \n", this.cliente.getNome());
        System.out.printf("Agência: %d \n",this.agencia);
        System.out.printf("Conta: %d \n", this.numeroConta);
        System.out.printf("Saldo: R$ %.2f \n", this.saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }


}
