import java.util.Scanner;

public class ExercicioUm {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 1 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Calcule a Área                                    |");
        System.out.println("| 3 - Calcule o Volume                                  |");
        System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
        System.out.println("| 5 - Cálculo de Bhaskara                               |");
        System.out.println("| 6 - Velocidade Média                                  |");
        System.out.println("| 7 - Percentual de Imposto                             |");
        System.out.println("| 8 - Valor é par ou ímpar                              |");
        System.out.println("| 9 - Comparar dois valores de String                   |");
        System.out.println("| 10 - Valor double em string e convertido para inteiro |");
        System.out.println("| 11 - Imposto de renda de um salário                   |");
        System.out.println("| 12 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que calcule a média (`(nota1 + nota2 + nota3 / 3)`)
            case 1:
            System.out.println(media(6, 7, 9)); 

                break;
            // 2) Crie um programa que calcule a área (`lado1 * lado2`)
            case 2:
            System.out.println(area(100,4));
                break;
            // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
            case 3:
            System.out.println(volume(15,37,14));
                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
            case 4:
            System.out.println(valorMaiorQueDobro(4,9));
                break;
            // 5) Crie um programa que calcule _bhaskara_
            case 5:
            //System.out.println(bhaskara(2,4,6));
                break;
            // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia (km) / tempo (h)`)
            case 6:
            System.out.println(mediaViagem(100,60));
                break;
            // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \ qtd imposto`)
            case 7:
            //System.out.println(percentualImposto(faturamento: 1000, qtdImposto: 100));
                break;
            // 8) Crie um programa que teste se um valor é par ou ímpar
            case 8:
            System.out.println(parOuImpar(55));
                break;
            // 9) Crie um programa que compare dois valores Strings
            case 9:
            // System.out.println(compareString(stringUm: 5, stringDois: 6))
                break;
            // 10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro
            case 10:
            // System.out.println(convertString(valor: 9))
                break;
            // 11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
            // Base                     | Alíquota
            // ---------                | ------
            // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%
            case 11:
            // System.out.println(percentualImpostoSalario(salario)
                break;
            // DESAFIO - Crie um programa que teste se um número é primo
            case 12:
            // System.out.print(testePrimo(valor))
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double media(double notaUm, double notaDois, double notaTres) {
        System.out.println("media");
        double media = (notaUm + notaDois + notaTres)/3;
        System.out.println("a media e " + media);
        return 0;
    }

    public static double area(double ladoUm, double ladoDois) {
        System.out.println("area");
        double area = (ladoUm * ladoDois);
        System.out.println("a area total e " + area);   
        return 0;
    }

    public static double volume(double largura, double altura, double profundidade) {
        System.out.println("volume");
        double volume = (largura * altura * profundidade);
        System.out.println("o volume total e " + volume);   
        return 0;
    }

    public static boolean valorMaiorQueDobro(double base, double verificar) {
        System.out.println("boolean");
        
        if (base * 2 == verificar) {
            System.out.println("o valor final é o dobro ");   
            return true;
        }

        System.out.println("o valor final não é o dobro ");   
        return false;
    }

    public static double[] bhaskara(int a, int b, int c) {
        //double delta = (b *b)-4 * a * c;
        //double[] bhaskara = new double
       
        return new double[2];
    }

    public static double mediaViagem(double distancia, double tempo) {
        System.out.println("mediaViagem");
        double mediaViagem = (distancia * tempo)/60;
        System.out.println("a media da viagem e " + mediaViagem);   
        return 0;
    }

    public static double percentualImposto(double faturamento, double qtdImposto) {
        return 0;
    }

    public static boolean parOuImpar(int valor) {
    if (valor % 2 == 0) {
            System.out.println("o valor final é par ");   
            return true;
        }

        System.out.println("o valor final é impar ");   
        return false;

    }

    public static boolean compareString(String stringUm, String stringDois) {
        return false;
    }

    public static int convertString(String valor) {
        return 0;
    }

    public static double percentualImpostoSalario(double salario) {
        return -1;
    }

    public static boolean testePrimo(int valor) {
        return false;
    }

}