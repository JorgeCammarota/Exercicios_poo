package Ex1;

public class Conta {
    private String nomedoCliente;
    private String numeroConta;
    private double saldo;

//  A sintaxe de get associa uma propriedade de um
//  objeto a uma função que será chamada quando tal propriedade é acessada


// Um Set representa um conjunto de valores, o qual não possui elementos duplicados.


    public String getNomedoCliente() {
        return nomedoCliente;
    }

    public void setNomedoCliente(String nomedoCliente) {
        this.nomedoCliente = nomedoCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        String s = "ContaBancaria[";
        s += " nomeCliente: " + nomedoCliente;
        s += "; numConta: " + numeroConta;
        s += "; saldo: " + saldo;
        s += "]" ;
        return s;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public boolean sacar(double valor){
        if ((saldo-valor) >=0){
            saldo -= valor;
            return true;
        }
        return false;
    }
}
