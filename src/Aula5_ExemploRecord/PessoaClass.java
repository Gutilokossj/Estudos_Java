package Aula5_ExemploRecord;

import java.util.Objects;

//Abaixo exemplo de uma CLASS tradicional

public class PessoaClass {

    private final String nome;
    private final int idade;

    public PessoaClass(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "PessoaClass{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaClass that = (PessoaClass) o;
        return idade == that.idade && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
}
