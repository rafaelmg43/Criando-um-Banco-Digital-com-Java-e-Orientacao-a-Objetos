package BancoDigital.Contas;

import BancoDigital.Clientes.Cliente;
import BancoDigital.Contas.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void ImprimirExtrato() {
        System.out.println(" *** Extrato Conta Poupança ***");
        super.imprimirInfosComuns();
    }
}
