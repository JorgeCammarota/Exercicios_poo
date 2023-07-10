package Ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, List<String>> dicionarios = new HashMap<>();

        List<String> cor = new ArrayList<>();
        cor.add("cinza");
        cor.add("azul");
        cor.add("roxo");
        cor.add("rosa");


        dicionarios.put("Cadeira", cor);
        dicionarios.put("Celular", cor);
        dicionarios.put("Cal", cor);
        dicionarios.put("Caneta", cor);


        Dicionario dicionario = new Dicionario();

        dicionario.setDicionario(dicionarios);


        System.out.println(dicionario.getDicionario());

        for (Map.Entry<String, List<String>> pair : dicionarios.entrySet()) {
            System.out.println(pair.getKey() + pair.getValue());

        }
    }
}
