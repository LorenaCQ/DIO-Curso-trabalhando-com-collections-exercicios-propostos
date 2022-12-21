package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExercicioProposto01 {
    static Scanner scan = new Scanner(System.in); //Para ler as temperaturas
    static List<Double> temperaturas = new ArrayList<>(); //Criação da lista das temperaturas

    public static void main(String[] args) {

        //Adiciona as temperaturas na Lista
        adicionarTemperaturas();

        //Imprime todas as temperaturas:
        imprimeTemperaturas();

        //Cálculo da média
        calcularMedia();

        //Imprime as médias
        imprimeMedia();


        //exibindo o mês das temperaturas acima da média por extenso:
        temperaturasAcimaDaMedia();
    }

    public static void adicionarTemperaturas(){

        int cont = 1;
        while (cont != 7) { //Estrutura de repetição para fazer a leitura das (6) temperaturas
            System.out.format("Digite a temperatura %d: ", cont);
            double temp = scan.nextDouble();
            temperaturas.add(temp); //Adiciona temperatura na Lista
            cont++;
        }
        System.out.println("----------------------------------------------------");
    }

    public static void imprimeTemperaturas(){
        System.out.print("Todas as temperaturas: ");
        System.out.print(temperaturas);
    }

    public static Double calcularMedia(){
        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average().orElse(0d);

        return media;
    }

    public static void imprimeMedia(){
        System.out.printf("\nMédia das temperaturas: %.1f\n", calcularMedia());

        //exibindo as temperaturas acima da média
        System.out.print("Temperaturas acima da média: ");
        temperaturas.stream()
                .filter(t -> t > calcularMedia())
                .forEach(t -> System.out.printf("%.1f ", t));
    }

    public static void temperaturasAcimaDaMedia(){
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();

        int cont = 1;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > calcularMedia()) {
                switch (cont) {
                    case (1):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (2):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (6):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            cont++;
        }
    }
}
