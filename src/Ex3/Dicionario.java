package Ex3;

import java.util.HashMap;
import java.util.List;

public class Dicionario {
    private HashMap<String, List<String>> dicionario;

    public Dicionario() {
    }

    public HashMap<String, List<String>> getDicionario() {
        return dicionario;
    }

    public void setDicionario(HashMap<String, List<String>> dicionario) {
        this.dicionario = dicionario;
    }
}
