package Ex4;

public class Main {
    public static void main(String[] args) {


        Animal gato = new Animal();
        gato.setNome("gato");
        gato.setComprimento(15);

        gato.setCor("Preto");
        gato.setAmbiente("Domestico");
        gato.setVelocidade(2);

        Peixe beta = new Peixe();
        beta.setNome("Beta");
        beta.setComprimento(5);
        beta.setVelocidade(1);

        Mamifero macaco = new Mamifero();
        macaco.setNome("Macaco");
        macaco.setComprimento(196);
        macaco.setCor("Preto");
        macaco.setVelocidade(0.5);

        Animal[] animais = new Animal[3];
        animais[0] = gato;
        animais[1] = beta;
        animais[2] = macaco;


        for (Animal animal : animais) {
            System.out.println(animal);

        }
    }
}
