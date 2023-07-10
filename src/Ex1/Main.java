package Ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println("ContaBancaria");

        Conta contaSimples = new Conta();
        contaSimples.setNomedoCliente("Jorge Lustosa de Souza");
        contaSimples.setNumeroConta("012345");

        contaSimples.depositar(10);

        realizarSaque(contaSimples, 60);

        realizarSaque(contaSimples, 800);

        System.out.println(contaSimples);

        System.out.println("ContaPoupança");

        ContaPoupanca contaPoupacanca = new ContaPoupanca();
        contaPoupacanca.setNomedoCliente("Joao do pé de feijao");
        contaPoupacanca.setNumeroConta("89657");
        contaPoupacanca.setDiaRendimento(8);

        contaPoupacanca.depositar(10);

        realizarSaque(contaPoupacanca, 30);

        realizarSaque(contaPoupacanca, 20);

        if (contaPoupacanca.calcularNovoSaldo(2.3)) {
            System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupacanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }

        System.out.println(contaPoupacanca);

        System.out.println("Ex1.ContaEspecial");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomedoCliente("Rute Lustosa");
        contaEspecial.setNumeroConta("005896");
        contaEspecial.setLimite(30);

        contaEspecial.depositar(10);

        realizarSaque(contaEspecial, 90);

        realizarSaque(contaEspecial, 50);

        realizarSaque(contaEspecial, 45);

        System.out.println(contaEspecial);
    }

    private static void realizarSaque(Conta conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }
    }
}
