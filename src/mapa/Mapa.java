/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa;

/**
 *
 * @author Adjamilton Junior - RA 1875652-5
 */
public class Mapa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crie duas contas correntes e duas poupanças (pode definir os números das contas como quiser)
        // Inicie as contas com saldos e limites diferentes de zero.
        ContaCorrente cc1 = new ContaCorrente(3028, 45674, 5, 450.00, 1000.00);
        ContaCorrente cc2 = new ContaCorrente(3028, 56872, 9, 1300.50, 2000.00);

        ContaPoupanca cp1 = new ContaPoupanca(3028, 34598, 7, 4200.00);
        ContaPoupanca cp2 = new ContaPoupanca(1457, 72397, 9, 17350.17);

        // Realize dois saques em quaisquer contas e exiba o saldo a seguir.
        cc1.saque(100.0);
        cc1.saldo();

        System.out.println("-------------------------------------------------------------\n");

        cp1.saque(1000.0);
        cp1.saldo();

        System.out.println("-------------------------------------------------------------\n");

        // Realize duas transferências e exiba os saldos das contas envolvidas.
        cc1.transferencia(100.00, cp1);
        cc1.saldo();
        cp1.saldo();

        System.out.println("-------------------------------------------------------------\n");

        cp2.transferencia(350.17, cc2);
        cp2.saldo();
        cc2.saldo();

        System.out.println("-------------------------------------------------------------\n");

        // Realize tentativas de um saque e uma transferência para uma conta corrente que não tenha saldo suficiente mesmo com o limite.
        cc1.saque(2000.0);
        cc1.saldo();

        System.out.println("-------------------------------------------------------------\n");

        cc2.transferencia(4000.0, cc1);
        cc2.saldo();

        System.out.println("-------------------------------------------------------------\n");

        // Realize tentativas de um saque e uma transferência para uma conta poupança que não tenha saldo suficiente.

        cp1.saque(5000.0);
        cp1.saldo();

        System.out.println("-------------------------------------------------------------\n");

        cp2.transferencia(21000.0, cp1);
        cp2.saldo();

        System.out.println("-------------------------------------------------------------\n");
    }
    
}
