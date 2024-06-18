package Aula5_ExemploRecord;

public class Main {
    public static void main(String[] args) {

        var pessoa = new PessoaClass("Gustavo", 23);
        System.out.println(pessoa);

        var pessoaRecord = new PessoaRecord("José", 40);
        System.out.println(pessoaRecord);
        pessoaRecord.printName();
        PessoaRecord.printMessage();

    }
}
