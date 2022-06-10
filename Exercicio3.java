package repeticao;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, base = 0, altura = 0;

        System.out.println("Informe o valor da base:");
        base = sc.nextDouble();
        while(base <= 0){
            System.out.printf("\nERRO: %.1f é um valor inválido.", base);
            System.out.println("\n\nInforme o valor da base (maior do que 0):");
            base = sc.nextDouble();
        }
        System.out.println("Informe o valor da altura:");
        altura = sc.nextDouble();
        while(altura <= 0){
            System.out.printf("\nERRO: %.1f é um valor inválido.", altura);
            System.out.println("\n\nInforme o valor da altura (maior do que 0):");
            altura = sc.nextDouble();
        }
 
        area = (base * altura) / 2;

        System.out.printf("\nA área do triângulo é %.1f.\n",area);

        sc.close();
    }
}
