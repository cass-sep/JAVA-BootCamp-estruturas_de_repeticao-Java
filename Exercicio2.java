package repeticao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double salario = 1000, aumento;
            int ano, atual;

            System.out.println("\nEm que ano nós estamos?");
            atual = sc.nextInt();

            if(atual >= 2016){
                    if(atual >= 2016){salario *= 1 + 11.67 / 100;}
                    if(atual >= 2017){salario *= 1 + 6.47 / 100;}
                    if(atual >= 2018){salario *= 1 + 1.81 / 100;}
                    if(atual >= 2019){salario *= 1 + 4.61 / 100;}
                    if(atual >= 2020){salario *= 1 + 4.68 / 100;}
                    if(atual >= 2021){salario *= 1 + 5.26 / 100;}
                    
                    if(atual >= 2022){
                        for(ano = 2022; ano <= atual; ano ++){
                            System.out.printf("Informe o percentual de aumento do salário para %d: ", ano);
                            aumento = sc.nextDouble();
                            salario *= 1 + aumento / 100;
                        }
                    }

                    System.out.printf("\nO salário em %d é de R$%.2f\n", atual, salario);
            } else {
                    System.out.println("\nValor inválido.");
            }
            sc.close();
        }
    }
}
