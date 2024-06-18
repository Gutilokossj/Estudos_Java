package Aula5_ExemploRecord;

//Exemplo Class Record, já cria automaticamente os GETTERS
//Os atributos também já são PRIVADOS e FINAL automaticamente (Não podem ser modificados)
//Cria também internamente um construtor que recebe os parâmetros.
//Já cria automaticamente métodos como ToString, Equals, hashcode...

//Record já extende da class do Java Record, de forma padrão, implicito, como ele já extende, não podemos extender de mais nenhuma outra classe.

public record PessoaRecord(String nome, int idade) {


    public static final String MENSAGEM_PADRAO = "Olá mundo";

    //Criação de metódos records...

    public void printName(){
        System.out.println("Nome: " + nome);
    }

    public static void printMessage(){
        System.out.println(MENSAGEM_PADRAO);
    }
}
