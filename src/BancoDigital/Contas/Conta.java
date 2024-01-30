package BancoDigital.Contas;

import BancoDigital.Clientes.Cliente;

public abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;
    private static final int NUMEROBANCO_PADRAO = 157;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.NumeroBanco = Conta.NUMEROBANCO_PADRAO;
        this.cliente = cliente;
    }

    protected int agencia;
    protected int numero;
    protected int NumeroBanco;
    protected float Saldo;
    protected Cliente cliente;

    @Override
    public void sacar(double valor) {
        this.Saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.Saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getNumeroBanco() {
        return NumeroBanco;
    }

    public float getSaldo() {
        return Saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular Conta: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Numero Do Banco : %d", this.NumeroBanco));
        System.out.println(String.format("Saldo : %.2f", this.Saldo ));
        System.out.println("             ");

    }
}
