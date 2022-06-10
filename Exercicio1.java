package repeticao;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double total = 0, media, nota;
            int contador, aprovados = 0, reprovados = 0;

            for(contador = 0; contador <= 9; contador ++){
                System.out.printf("Informe a %d nota:", contador + 1);
                nota = sc.nextDouble();
                total += nota;
                if(nota >= 6.0){
                    aprovados ++;
                } else {
                    reprovados ++;
                }
            }

            media = total / contador;
            
            System.out.printf("Alunos aprovados: %d.\n", aprovados);
            System.out.printf("Alunos reprovados: %d.\n", reprovados);
            System.out.printf("A média dos alunos é %.1f", media);
            sc.close();
        }
    }
}
