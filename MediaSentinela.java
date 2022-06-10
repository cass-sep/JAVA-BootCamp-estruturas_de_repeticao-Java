package repeticao;

import java.util.Scanner;

public class MediaSentinela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = 0, total = 0, media;
        int contador = 0;

        System.out.println("Informe uma nota ou -1 para sair: ");
        valor = sc.nextDouble();
        
        while(valor != -1){
            total += valor;
            contador ++;
            
            System.out.printf("Informe uma nota ou -1 para sair: ", contador);
            valor = sc.nextDouble();
        }

        if(contador != 0){
            media = total / contador;

            System.out.printf("Total de alunos: %d\n", contador);
            System.out.printf("Soma das notas: %.1f\n", total);
            System.out.printf("Média da classe: %.1f", media);
        } else {
            System.out.println("Nenhuma nota cadastrada.");
        }

        sc.close();
    }
}
