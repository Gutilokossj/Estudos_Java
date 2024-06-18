package Aula6_Funcoes_Lambdas;

//Quando definimos um método na interface, por padrão ele é PUBLIC e ABSTRACT
//@Functional é para ilustrar que a interface é funcional
//Interface funcional só pode ter UM MÉTODO ABSTRATO

@FunctionalInterface
public interface Taxi {
    double reservar(String origem, String destino);
}
