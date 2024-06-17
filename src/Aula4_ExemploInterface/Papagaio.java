package Aula4_ExemploInterface;

public class Papagaio implements Animal {

    @Override
    public void FazerSom() {
        System.out.println("Repetir palavras");
    }

    @Override
    public void Mover() {
        System.out.println("Voando");
    }
}
