package model;

public interface IConta {

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public abstract void transferir(double valor, Conta contaDestino);

}
