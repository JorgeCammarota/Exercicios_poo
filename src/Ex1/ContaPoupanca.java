package Ex1;

import Ex1.Conta;

 import java.util.Calendar;

    public class ContaPoupanca extends Conta {
        private int diaRendimento;

        public int getDiaRendimento() {
            return diaRendimento;
        }

        public void setDiaRendimento(int diaRendimento) {
            this.diaRendimento = diaRendimento;
        }

        @Override
        public String toString() {
            String s = "ContaPoupança[";
            s += " diaRendimento: " + diaRendimento;
            s += "; " + super.toString();
            s += "]" ;
            return s;
        }

        public boolean calcularNovoSaldo(double taxaRendimento){

            Calendar hoje = Calendar.getInstance();

            if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
                this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
                return true;
            }
            return false;
        }
    }

