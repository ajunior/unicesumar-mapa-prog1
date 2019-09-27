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
public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int agencia, int conta, int digito, double saldo, double limite) {
        super();
        super.setAgencia(agencia);
        super.setConta(conta);
        super.setDigito(digito);
        super.setSaldo(saldo);

        setLimite(limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void saque(double valor) {
        if (valor <= 0) {
            System.out.println("Saque não realizado. O valor informando para saque deve ser superior a zero.");
            return;
        }

        if ((getSaldo() > 0) && (valor <= getSaldo())) {
            super.saque(valor);
            return;
        }

        if ((getSaldo() - valor) < -limite) {
            System.out.println("Saque não realizado. O valor informado excede o limite especial da conta.");
            System.out.println("Valor máximo que pode ser sacado usando limite especial é de R$ " + (getSaldo() + this.limite));
            return;
        }

        setSaldo(getSaldo() - valor);
        System.out.println("Saque no valor de R$ " + valor + " efetuado com sucesso na conta: " + conta + ".");
    }

    @Override
    public void transferencia(double valor, Conta conta) {
        if (valor <= 0) {
            System.out.println("Transferência não realizada. O valor informando para transferência deve ser superior a zero.");
            return;
        }

        if ((getSaldo() > 0) && (valor <= getSaldo())) {
            super.transferencia(valor, conta);
            return;
        }

        if ((getSaldo() - valor) < -limite) {
            System.out.println("Transferência não realizada. O valor informado excede o limite especial da conta.");
            System.out.println("Valor máximo que pode ser transferido usando limite especial é de R$ " + (getSaldo() + this.limite));
            return;
        }

        conta.setSaldo(conta.getSaldo() + valor);
        setSaldo(getSaldo() - valor);
        System.out.println("Transferência no valor de R$ " + valor + " efetuada com sucesso da conta " + this.conta + " para conta " + conta.getConta() + ".");
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", digito=" + digito +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
