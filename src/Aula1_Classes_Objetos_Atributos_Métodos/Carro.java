package Aula1_Classes_Objetos_Atributos_Métodos;

public class Carro {

    //atributos
   String nome;
   String marca;
   int ano;
   int velocidade;

   //Métodos
    void  acelerar(int aceleracao){
        velocidade += aceleracao;
    }

    void freiar(int reduzir){
        velocidade -= reduzir;
    }

    void buzinar(){
        System.out.println("Bi bi bi!");
    }
}
