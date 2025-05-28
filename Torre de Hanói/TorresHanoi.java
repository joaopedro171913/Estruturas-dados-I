import java.time.Duration;
import java.time.LocalDateTime;

public class TorresHanoi {
    private static long movimentos = 0;

    public static void main(String[] args) {
        int[] numDiscosParaTestar = {1, 10, 20, 30, 40, 41};

        for (int discos : numDiscosParaTestar) {
            System.out.println("--- Executando para " + discos + " discos ---");
            executarHanoi(discos);
            System.out.println("\n");
        }
    } 
    public static void executarHanoi(int n) {
        movimentos = 0;

        LocalDateTime inicio = LocalDateTime.now(); 
        resolverHanoi(n, 'A', 'C', 'B'); 
        LocalDateTime fim = LocalDateTime.now(); 

        Duration duracao = Duration.between(inicio, fim);


        long horas = duracao.toHours();
        long minutos = duracao.toMinutesPart();
        long segundos = duracao.toSecondsPart();
        long milissegundos = duracao.toMillisPart();

        String tempoFormatado = String.format("%02d:%02d:%02d:%03d",
                horas, minutos, segundos, milissegundos);

        System.out.println("Tempo gasto: " + tempoFormatado);
        System.out.println("Quantidade de movimentos: " + movimentos);
    }
//pinos //
    public static void resolverHanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            movimentos++; 
            return; 
        }
        resolverHanoi(n - 1, origem, auxiliar, destino);
        movimentos++;
        resolverHanoi(n - 1, auxiliar, destino, origem);
    }
}