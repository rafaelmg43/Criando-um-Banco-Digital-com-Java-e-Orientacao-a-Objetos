package BancoDigital.Contas;

import BancoDigital.Clientes.Cliente;
import BancoDigital.Contas.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void ImprimirExtrato() {
        System.out.println(" *** Extrato Conta Corrente ***");
        super.imprimirInfosComuns();
    }

}
