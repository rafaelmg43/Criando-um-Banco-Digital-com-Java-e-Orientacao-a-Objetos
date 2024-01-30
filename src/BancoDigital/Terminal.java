package BancoDigital;

import BancoDigital.Clientes.Cliente;
import BancoDigital.Contas.Conta;
import BancoDigital.Contas.ContaCorrente;
import BancoDigital.Contas.ContaPoupanca;

public class Terminal {
    public static void main(String[] args) {
        Cliente Rafael = new Cliente();
        Rafael.setNome("Rafael Cruz");
        Conta cc = new ContaCorrente(Rafael);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(Rafael);
        cc.transferir(50,cp);


        cc.ImprimirExtrato();
        cp.ImprimirExtrato();
    }
}
