package Aula1_Classes_Objetos_Atributos_Métodos;

public class CarroTestar {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.nome = "Uno";
        carro1.marca = "Fiat";
        carro1.ano = 2015;
        carro1.velocidade = 60;

        carro1.acelerar(10);

        System.out.println("Velocidade: " + carro1.velocidade + "Km/h");

        carro1.freiar(30);

        System.out.println("Velocidade: " + carro1.velocidade + "Km/h");

        carro1.buzinar();
    }
}
