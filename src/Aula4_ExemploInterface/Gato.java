package Aula4_ExemploInterface;

public class Gato implements Animal {

    @Override
    public void FazerSom() {
        System.out.println("Miau Miau");
    }

    @Override
    public void Mover() {
        System.out.println("Lentamente");
    }
}
