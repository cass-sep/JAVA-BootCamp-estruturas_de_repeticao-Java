package repeticao;

import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        
        double total = 0, media;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        
        while(contador <= 9){
            System.out.printf("Informe a %dª nota: ", contador + 1);
            total += sc.nextDouble();
            contador ++;
        }

        media = total / contador;
        

        System.out.printf("\n\nO total de alunos é %d", contador);
        System.out.printf("\nO total de todas as notas é %.1f", total);
        System.out.printf("\nA média da turma é %.1f", media);

        sc.close();
    }
}
