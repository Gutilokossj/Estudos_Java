package Aula2_Construtores;

public class ProdutoTestar {
    public static void main(String[] args) {

        //construtor padrão:
        Produto produto1 = new Produto();
        produto1.nome = "Caneta Preta";
        produto1.marca = "Bic";
        produto1.valor = 1.50f;
        //1.50 usa o F DEPOIS, pois tem que identificar que é mesmo um float

        //contrutor de dois parâmetros:
        Produto produto2 = new Produto("Caneta Vermelha","Faber");
        produto2.valor = 1.69f;

        //contrutor de três parâmetros:
        Produto produto3 = new Produto("Borracha","Mercur",1.89f);

        //objeto1
        System.out.println("\nNome: " + produto1.nome + "\nMarca: " + produto1.marca + "\nValor: " + produto1.valor);

        //objeto2
        System.out.println("\nNome: " + produto2.nome + "\nMarca: " + produto2.marca + "\nValor: " + produto2.valor);

        //objeto3
        System.out.println("\nNome: " + produto3.nome + "\nMarca: " + produto3.marca + "\nValor: " + produto3.valor);

    }
}
