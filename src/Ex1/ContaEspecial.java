package Ex1;

import Ex1.Conta;

public class ContaEspecial extends Conta {
    private double limite;

    public double getLimite() {
        return limite;
    }


    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s = "Ex1.ContaEspecial: ";
        s += " limite: " + limite;
        s += "; " + super.toString();
        s += " ] " ;
        return s;
    }

    public boolean sacar(double valor){

        double saldoComLimite = this.getSaldo() + limite;

        if ((saldoComLimite-valor) >=0){
            this.setSaldo(this.getSaldo()-valor);

            return true;
        }

        return false;
    }
}