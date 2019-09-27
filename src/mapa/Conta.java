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
public abstract class Conta {
    protected int agencia;
    protected int conta;
    protected int digito;
    protected double saldo;

    public Conta() {
        // Construtor vazio
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque(double valor) {
        if (valor <= 0) {
            System.out.println("Saque não realizado. O valor informando para saque deve ser superior a zero.");
            return;
        }

        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque no valor de R$ " + valor + " efetuado com sucesso na conta: " + conta + ".");
        } else {
            System.out.println("Saque não realizado. O saldo é inferior ao valor informado para saque.");
        }
    }

    public void deposito(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito não realizado. O valor informando para depósito deve ser superior a zero.");
            return;
        }

        setSaldo(getSaldo() + valor);
        System.out.println("Depósito no valor de R$ " + valor + " efetuado com sucesso na conta: " + conta + ".");
    }

    public void transferencia(double valor, Conta conta) {
        if (valor <= 0) {
            System.out.println("Transferência não realizada. O valor informando para transferência deve ser superior a zero.");
            return;
        }

        if (valor <= getSaldo()) {
            conta.setSaldo(conta.getSaldo() + valor);
            setSaldo(getSaldo() - valor);
            System.out.println("Transferência no valor de R$ " + valor + " efetuada com sucesso da conta " + this.conta + " para conta " + conta.getConta() + ".");

        } else {
            System.out.println("Transferência não realizada. O valor informado para transferência é superior ao saldo.");
        }
    }

    public void saldo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", digito=" + digito +
                ", saldo=" + saldo +
                '}';
    }
}
