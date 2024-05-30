package Basico.Estudos.PrimeiroEstudos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cálculo Celsius para Fahrenheit");

        double temperatura = 26.5;
        int conversor = (int) ((double) (temperatura * 1.8) + 32);

        System.out.println("A temperatura de " + temperatura + " graus Celsius, é exatamente " + conversor + " Fahrenheit");

        }
    }
