package Aula4_ExemploInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aula de Interfaces!");

        Gato g = new Gato();
        g.FazerSom();
        g.Mover();

        Cachorro c = new Cachorro();
        c.FazerSom();
        c.Mover();

        Papagaio p = new Papagaio();
        p.FazerSom();
        p.Mover();

    }
}
