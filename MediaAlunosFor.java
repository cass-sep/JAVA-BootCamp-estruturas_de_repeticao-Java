package repeticao;

import java.util.Scanner;

public class MediaAlunosFor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double total = 0, media;
            int contador;

            for(contador = 0; contador <= 9; contador++){
                System.out.printf("Informe a %d nota: ", contador + 1);
                total += sc.nextDouble();
            }
            media = total / contador;

            System.out.printf("Total de alunos na classe é %d", contador);
            System.out.printf("\nA soma de todas as notas dos alunos é %.0f", total);
            System.out.printf("\nA média da classe é %.1f", media);
            
            sc.close();
        }
    }
}
