# MAPA (Programação 1)

Suponha que um grande banco tenha decidido abandonar todo o seu sistema feito em Cobol que funciona muito bem há décadas e resolveu te contratar para reescrever todo o sistema em Java. A princípio, você deve escrever operações básicas para contas corrente e poupança. Após um tempo de análise, você escreveu o diagrama de classes abaixo para realizar a sua implementação:

<img src="https://github.com/ajunior/unicesumar-mapa-prog1/raw/master/assets/QUE_73993_235941_1.png" alt="Diagrama UML do projeto">

Para isso você vai precisar criar:

- Um novo projeto no NetBeans, do tipo "Aplicativo Java"
- Uma classe "Conta" que será uma superclasse.
- As classes "ContaCorrente" e "ContaPoupanca", que herdam as características da classe "Conta".
- As contas possuem, em comum, informações de agência, número, dígito e saldo.
- Você deve implementar os métodos: saque, deposito, saldo e transferência.
    - O método saldo deve exibir na tela as informações da conta e o saldo.
    - O método saque deve registrar um saque, ou seja, retirar da conta um valor.
    - O método depósito registra um valor a mais na conta.
    - O método transferência retira um valor da conta atual e o coloca em uma outra conta informada.
- Note que as operações de saque e transferência devem verificar se há saldo disponível. No caso da conta corrente, considerar o limite.
- Para definir as informações da conta, utilize os métodos acessores (getters e setters).
- As contas poupança possuem um método rendimento, que deve aumentar o saldo de acordo com a porcentagem informada.
- Exemplo: Rendimento de 2% em uma conta com saldo de 500 reais
    - rendimento(0.02) → o saldo deve ficar em 510 reais

No método main da classe principal do sistema, deixe os seguintes comandos:
- Crie duas contas correntes e duas poupanças (pode definir os números das contas como quiser)
- Inicie as contas com saldos e limites diferentes de zero.
- Realize dois saques em quaisquer contas e exiba o saldo a seguir.
- Realize duas transferências e exiba os saldos das contas envolvidas.
- Realize tentativas de um saque e uma transferência para uma conta corrente que não tenha saldo suficiente mesmo com o limite.
- Realize tentativas de um saque e uma transferência para uma conta poupança que não tenha saldo suficiente.

Depois de finalizado, exporte seu projeto no formato .zip e envie. No NetBeans: Arquivo > Exportar Projeto > Para ZIP…
