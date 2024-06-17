package Aula4_ExemploInterface;

public class Cachorro implements Animal{

    @Override
    public void FazerSom() {
        System.out.println("Au au");
    }

    @Override
    public void Mover() {
        System.out.println("Correndo como um louco");
    }
}
