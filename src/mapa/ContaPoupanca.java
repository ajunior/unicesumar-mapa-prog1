/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa;

/**
 *
 * @author Junior
 */
public class ContaPoupanca extends Conta {
    
    public ContaPoupanca() {
        // Construtor vazio.
    }

    public ContaPoupanca(int agencia, int conta, int digito, double saldo) {
        super();
        super.setAgencia(agencia);
        super.setConta(conta);
        super.setDigito(digito);
        super.setSaldo(saldo);
    }

    public void rendimento(double perc) {
        super.setSaldo(getSaldo() + (getSaldo() * (perc/100)));
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", digito=" + digito +
                ", saldo=" + saldo +
                '}';
    }
}
