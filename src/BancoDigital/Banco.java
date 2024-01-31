package BancoDigital;
import java.util.List;

import BancoDigital.Clientes.Cliente;
import BancoDigital.Contas.Conta;
import BancoDigital.Contas.ContaCorrente;
import BancoDigital.Contas.ContaPoupanca;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(Conta contas) {
        this.contas = (List<Conta>) contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
