package BancoDigital.Contas;

import BancoDigital.Contas.Conta;

public interface iConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void ImprimirExtrato();

}
