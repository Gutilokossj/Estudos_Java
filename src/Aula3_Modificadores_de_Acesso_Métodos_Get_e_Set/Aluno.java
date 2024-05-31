package Aula3_Modificadores_de_Acesso_Métodos_Get_e_Set;

public class Aluno {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    //validação do SETIDADE que só fazemos com métodos e com variaveis privadas

    public void setIdade(int idade){
        if(idade >0 && idade < 130){
            this.idade = idade;
            System.out.println("Idade cadastrada");
        }else{
            System.out.println("Idade inválida");
        }
        }
        public int getIdade(){
        return idade;
    }

}
