package Ex4;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero() {
        super();
        this.setCor("Preto");
        this.setAmbiente("Arvores");
        this.alimento = "Banana";
    }


    public String getAlimento() {
        return alimento;
    }


    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nAlimento: " + alimento;
        return s;
    }
}

