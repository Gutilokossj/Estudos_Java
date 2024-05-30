package Basico.Estudos.PrimeiroEstudos;

import java.util.Random;
import java.util.Scanner;

public class JogoSimulacao {
    public static void main(String[] args) {

        Scanner leitura =  new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int contador = 1;

        while(contador <= 5){

            System.out.println("Tentativa N°" + contador + ", tente acertar, de 0 a 100, boa sorte :) ");
            int tentativaNumero = leitura.nextInt();

            if(tentativaNumero == numeroAleatorio){
                System.out.println("Muito bem, você acertou, o número pensado foi: " + numeroAleatorio);
                break;
            }
            if(tentativaNumero > numeroAleatorio) {
                System.out.println("Desculpe, você errou, o número pensado é menor do que: " + tentativaNumero);
                contador++;
            }
            if(tentativaNumero < numeroAleatorio){
                System.out.println("Desculpe, você errou, o número pensado é maior do que: " + tentativaNumero);
                contador++;
            }

            if(contador > 5){
                System.out.println("Desculpa, suas chances acabaram, volte outro dia!");

            }
        }


    }
}
