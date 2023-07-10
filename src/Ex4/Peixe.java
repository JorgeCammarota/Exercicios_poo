package Ex4;

public class Peixe extends Animal {
    private String caracteristicas;

    public Peixe() {
        super();
        this.setPatas(0);
        this.setAmbiente("aquario");
        this.setCor("albino");
        this.caracteristicas = "olhos e boca";
    }


    public String getCaracteristicas() {
        return caracteristicas;
    }


    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nCaracterísticas: " + caracteristicas;
        return s;
    }
}
