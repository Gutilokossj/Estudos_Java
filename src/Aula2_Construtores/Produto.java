package Aula2_Construtores;

public class Produto {
    //atributos
    String nome;
    String marca;
    float valor;

    //construtores
    Produto(){

    }
    //Exemplo de contrutor sem parãmetro, não obriga ter nome, marca e valor.

    Produto(String nome){
        this.nome = nome;
    }
    //exemplo construtor com 1 parâmetro, obriga ter nome, o restante mesma lógica.

    Produto(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    Produto(String nome, String marca, float valor){
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }
}
