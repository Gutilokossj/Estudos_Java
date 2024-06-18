package Aula6_Funcoes_Lambdas;


//O lambda cria de forma dinâmica uma class
//Exemplo implementando o método da interface Taxi

//UMA EXIGENCIA DO LAMBDA É QUE A INTERFACE TENHA APENAS UM ÚNICO MÉTODO ABSTRATO

public class Main {
    public static void main(String[] args) {
       Taxi taxi1 = (origem, desitno) -> {
               System.out.println("Taxi reservado, origem: " + origem + "\nDestino: " + desitno);
               return 90.40;
       };
       double valoreReserva = taxi1.reservar("José Bonifácio", "São José do Rio Preto");
        System.out.println("Valor do reserva: " + valoreReserva);
    }
}
