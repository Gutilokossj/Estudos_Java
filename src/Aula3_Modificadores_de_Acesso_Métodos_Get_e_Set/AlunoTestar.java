package Aula3_Modificadores_de_Acesso_Métodos_Get_e_Set;

public class AlunoTestar {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        //aluno1.nome = "Gustavo"; Aqui deu erro, pois a variável é do tipo "PRIVATE" e só poderia
        //ser acessado pela própria class

        aluno1.setNome("Gustavo");
        System.out.println("Nome: " + aluno1.getNome());

        //aluno1.idade = 500;
        //Exemplo do porquê tem que ser privado os atributos(variaveis, pro usuário não colocar
        //qualquer coisa

        aluno1.setIdade(50);
        System.out.println("Idade: " + aluno1.getIdade());

    }
}
