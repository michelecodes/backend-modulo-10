import java.util.Scanner;

public class VerificarNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Notas de Michele
        int[] linguagem = {9, 9, 10};
        int[] matematica = {10, 10, 9};
        int[] ciencias = {8, 9, 9};
        int[] humanidades = {7, 6, 6};

        // Verificar se precisa de recuperação em cada matéria
        verificarRecuperacao("Linguagem", linguagem);
        verificarRecuperacao("Matematica", matematica);
        verificarRecuperacao("Ciencias", ciencias);
        verificarRecuperacao("Humanidades", humanidades);

        scanner.close();
    }

    // Função para verificar se precisa de recuperação em uma matéria
    private static void verificarRecuperacao(String materia, int[] notas) {
        double media = calcularMedia(notas);
        System.out.println("Média em " + materia + ": " + media);

        if (media < 7) {
            System.out.println("Michele precisa de recuperação em " + materia);
        } else {
            System.out.println("Michele não precisa de recuperação em " + materia);
        }
    }

    // Função para calcular a média das notas
    private static double calcularMedia(int[] notas) {
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return soma / (double) notas.length;
    }
}
